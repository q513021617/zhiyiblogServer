import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '@/views/Home.vue'
import usermanager from '@/views/usermanager.vue'
import articleManage from '@/views/articleManage.vue'
Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'index',
    component: Home
  },
  {
    path: '/home',
    name: 'home',
    component: Home
  },
  {
    path: '/usermanager',
    name: 'usermanager',
    component: usermanager
  },
  {
    path: '/articleManage',
    name: 'articleManage',
    component: articleManage
  }
]

const router = new VueRouter({
  routes,
  linkActiveClass:'active',
  // linkExactActiveClass:'active',
})

export default router
