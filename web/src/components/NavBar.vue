<template>
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <div class="container">

            <a class="navbar-brand" href="/">
                <img src="../assets/images/logo.png" alt="Logo" width="140" height="40"
                    class="d-inline-block align-text-top">
            </a>
            <!-- <router-link class="navbar-brand" :to="{ name: 'home' }">OCP</router-link> -->
            <div class="collapse navbar-collapse" id="navbarText">
                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                    <li class="nav-item">
                        <router-link :class="route_name == 'vt_index' ? 'nav-link active' : 'nav-link'"
                            :to="{ name: 'vt_index' }">Video Tools</router-link>
                    </li>
                    <li class="nav-item">
                        <router-link :class="route_name == 'at_index' ? 'nav-link active' : 'nav-link'"
                            :to="{ name: 'at_index' }">Audio Tools</router-link>
                    </li>
                    <li class="nav-item">
                        <router-link :class="route_name == 'pdft_index' ? 'nav-link active' : 'nav-link'"
                            :to="{ name: 'pdft_index' }">PDF Tools</router-link>
                    </li>
                    <li class="nav-item">
                        <router-link :class="route_name == 'fc_index' ? 'nav-link active' : 'nav-link'"
                            :to="{ name: 'fc_index' }">File Conventer</router-link>
                    </li>

                </ul>

                <!--右侧下拉列表-->
                <!-- <ul class="navbar-nav">
                    <button>
                        Log In
                    </button>
                </ul> -->


                <ul class="navbar-nav" v-if="$store.state.user.is_login">
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button"
                            data-bs-toggle="dropdown" aria-expanded="false">
                            {{ $store.state.user.username }}
                        </a>
                        <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <li>

                                <router-link class="dropdown-item" :to="{ name: 'user_bot_index' }">My Space</router-link>
                            </li>
                            <li>
                                <hr class="dropdown-divider">
                            </li>
                            <li><a class="dropdown-item" href="#" @click="logout">Log Out</a></li>
                        </ul>
                    </li>
                </ul>
                <ul class="navbar-nav" v-else-if="!$store.state.user.pulling_info">
                    <li class="nav-item">
                        <router-link class="nav-link" :to="{ name: 'user_account_login' }" role="button">
                            <button>Log In</button>
                        </router-link>
                    </li>
                    <li class="nav-item">
                        <router-link class="nav-link" :to="{ name: 'user_account_register' }" role="button">
                            <button>Sign Up</button>
                        </router-link>
                    </li>
                </ul>






            </div>
        </div>
    </nav>
</template>
<script>
import { useRoute } from 'vue-router'
import { computed } from 'vue'
import { useStore } from 'vuex';

export default {
    setup() {
        const store = useStore();
        const route = useRoute();
        let route_name = computed(() => route.name)

        const logout = () => {
            store.dispatch("logout");
        }

        return {
            route_name,
            logout
        }
    }
}

</script>
<style scoped>
/* .navbar-brand {
    /* 设置logo字体
    font-family: "Edwardian Script ITC", cursive;
    font-size: 30px;
} */
.navbar-nav li {
    margin-right: 25px;
}

.navbar-nav li {
    text-decoration: none;
    font-family: "Times New Roman", Times, serif;
    /* 将字体设置为 Times New Roman */
}

.navbar-nav button {
    font-family: "Times New Roman", Times, serif;
    border: 1px solid gray;
    background-color: #212529;
    color: #939d9e;
    border-radius: 5px;
    width: 70px;
}

.navbar-nav button:hover {
    color: #C7C8C9;
}
</style>

