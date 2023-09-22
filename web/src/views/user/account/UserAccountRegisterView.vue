<template>
    <ContentField>
        <div class="row justify-content-md-center">
            <div class="col-4">
                <div class="h_create">Create an Account</div>
                <form @submit.prevent="register">
                    <div class="mb-4">
                        <label for="username" class="form-label">Username</label>
                        <input v-model="username" type="text" class="form-control" id="username"
                            placeholder="Your username">
                    </div>
                    <div class="mb-4">
                        <label for="password" class="form-label">Password</label>
                        <input v-model="password" type="password" class="form-control" id="password"
                            placeholder="Your password">
                    </div>
                    <div class="mb-4">
                        <label for="password" class="form-label">Confirm Password</label>
                        <input v-model="confirmedPassword" type="password" class="form-control" id="confirmedPassword"
                            placeholder="Your password">
                    </div>
                    <div class="error-message">{{ error_message }}</div>
                    <button type="submit" class="btn btn-primary">Submit</button>
                    <div class="notice">By creating an account you agree to our Privacy & Terms</div>
                    <div class="alternative">Already have an account?&nbsp;<a href="#">Log In</a></div>
                </form>
            </div>
        </div>
    </ContentField>
</template>
<script>
import ContentField from '../../../components/ContentField.vue'
import { ref } from 'vue'
import { useStore } from 'vuex'
import router from '../../../router/index'
import $ from 'jquery'

export default {
    components: {
        ContentField
    },
    setup() {
        const store = useStore();
        let username = ref('');
        let password = ref('');
        let confirmedPassword = ref('');
        let error_message = ref('');

        const register = () => {
            $.ajax({
                url: "http://127.0.0.1:3000/user/account/register/",
                type: "post",
                data: {
                    username: username.value,
                    password: password.value,
                    confirmedPassword: confirmedPassword.value,
                },
                headers: {
                    Authorization: "Bearer " + store.state.user.token,
                },
                success(resp) {
                    if (resp.error_message === "success") {
                        router.push({ name: "user_account_login" });
                    } else {
                        error_message.value = resp.error_message;
                    }
                },
            });
        }

        return {
            username,
            password,
            confirmedPassword,
            error_message,
            register,
        }
    }
}

</script>
<style scoped>
.h_create {
    font-size: 35px;
    font-weight: bold;
    display: flex;
    justify-content: center;
    align-items: center;
    margin-top: 10px;
    margin-bottom: 15px;
}

button {
    width: 100%;
}

div.error-message {
    color: red;
}

.notice {
    color: #999;
    line-height: 1.4;
    font-weight: 300;
    font-size: 10px;
    display: flex;
    justify-content: center;
    align-items: center;
    margin-top: 5px;
    margin-bottom: 10px;
}

.fogretpassword {
    color: #0D6EFD;
    display: flex;
    justify-content: center;
    align-items: center;
    font-size: 14px;
    margin-top: 15px;
    margin-bottom: 10px;
}

.alternative {
    display: flex;
    justify-content: center;
    align-items: center;
    font-size: 14px;

    margin-top: 20px;
    margin-bottom: 10px;
}
</style>
