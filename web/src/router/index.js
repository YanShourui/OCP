import { createRouter, createWebHistory } from 'vue-router'
import NotFound from '../views/error/NotFound'
import VideoToolsIndexView from '../views/vt/VideoToolsIndexView'
import AudioToolsIndexView from '../views/at/AudioToolsIndexView'
import PDFToolsIndexView from '../views/pdft/PDFToolsIndexView'
import UserBotIndexView from '../views/user/bot/UserBotIndexView'
import HomeIndexView from '../views/home/HomeIndexView'
import FileConventerIndexView from '../views/fc/FileConventerIndexView'
import UserAccountLoginView from '../views/user/account/UserAccountLoginView'
import UserAccountRegisterView from '../views/user/account/UserAccountRegisterView'
import store from '../store/index'



const routes = [
  {
    path: "/",
    name: "home",
    component: HomeIndexView,
    meta: {
      requestAuth: false,
    }
  },
  {
    path: "/vt/",
    name: "vt_index",
    component: VideoToolsIndexView,
    meta: {
      requestAuth: true,
    }
  },
  {
    path: "/at/",
    name: "at_index",
    component: AudioToolsIndexView,
    meta: {
      requestAuth: true,
    }
  },
  {
    path: "/pdft/",
    name: "pdft_index",
    component: PDFToolsIndexView,
    meta: {
      requestAuth: true,
    }
  },
  {
    path: "/fc/",
    name: "fc_index",
    component: FileConventerIndexView,
    meta: {
      requestAuth: true,
    }
  },
  {
    path: "/user/account/login/",
    name: "user_account_login",
    component: UserAccountLoginView,
    meta: {
      requestAuth: false,
    }
  },
  {
    path: "/user/account/register/",
    name: "user_account_register",
    component: UserAccountRegisterView,
    meta: {
      requestAuth: false,
    }
  },
  {
    path: "/user/bot/",
    name: "user_bot_index",
    component: UserBotIndexView,
    meta: {
      requestAuth: true,
    }
  },
  {
    path: "/404/",
    name: "404",
    component: NotFound,
    meta: {
      requestAuth: false,
    }
  },
  {
    path: "/:catchAll(.*)",
    redirect: '/404/'
  },
]

const router = createRouter({
  history: createWebHistory(),
  routes
})

router.beforeEach((to, from, next) => {
  if (to.meta.requestAuth && !store.state.user.is_login) {
    next({ name: "user_account_login" });
  } else {
    next();
  }
})


export default router
