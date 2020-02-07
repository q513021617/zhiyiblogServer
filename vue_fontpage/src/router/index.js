import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../views/Home.vue'
import ArticleList from '@/views/articleList.vue'
import ArticleDetail from '@/views/articleDetail.vue'

import AboutMe from '@/views/AboutMe.vue'
Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'home',
    component: Home
  },
  {
    path: '/articleList',
    name: 'articleList',
   
    component: ArticleList
  },
  {
    path: '/articleDetail',
    name: 'articleDetail',
   
    component: ArticleDetail
  },
  {
    path: '/aboutMe',
    name: 'aboutMe',
   
    component: AboutMe
  }
]

const router = new VueRouter({
  routes,
  linkActiveClass:'active'
})

export default router
