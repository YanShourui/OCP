<template>
    <ContentField v-if="!$store.state.user.pulling_info">
        <div class="row justify-content-md-center">
            <div class="col-4">
                <div class="h_create">Log In</div>
                <form @submit.prevent="login">
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
                    <div class="error-message">{{ error_message }}</div>
                    <button type="submit" class="btn btn-primary">Submit</button>
                    <!-- <div class="notice">By creating an account you agree to our Privacy & Terms</div> -->
                    <div class="fogretpassword">Forgot password?</div>
                    <div class="alternative">Don't have an account? &nbsp;<a href="#">Sign Up</a></div>
                </form>
            </div>
        </div>
    </ContentField>
</template>
<script>
import ContentField from '../../../components/ContentField.vue'
import { useStore } from 'vuex'
import { ref } from 'vue'
import router from '../../../router/index'

export default {
    components: {
        ContentField
    },
    setup() {
        const store = useStore();
        let username = ref('');
        let password = ref('');
        let error_message = ref('');

        const jwt_token = localStorage.getItem("jwt_token");
        if (jwt_token) {
            store.commit("updateToken", jwt_token);
            store.dispatch("getinfo", {
                success() {
                    router.push({ name: "home" });
                    store.commit("updatePullingInfo", false);
                },
                error() {
                    store.commit("updatePullingInfo", false);
                }
            })
        } else {
            store.commit("updatePullingInfo", false);
        }


        const login = () => {
            error_message.value = "";
            store.dispatch("login", {
                username: username.value,
                password: password.value,
                success() {
                    store.dispatch("getinfo", {
                        success() {
                            router.push({ name: 'home' });
                        }
                    })
                },
                error() {
                    error_message.value = "用户名或密码错误";
                }

            })
        }

        return {
            username,
            password,
            error_message,
            login,
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