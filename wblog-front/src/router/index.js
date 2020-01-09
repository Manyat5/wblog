import Vue from 'vue'
import Router from 'vue-router'

import article from "../views/article";
import articleRouters from "./inclue/article";

import personal from "../views/personal";

import setting from "../views/setting";

Vue.use(Router)

export default new Router({
  routes: [
    {
      path:'/personal',
      name:'personal',
      component:personal
    },
    {
      path:'/setting',
      name:'setting',
      component:setting
    },
    {
      path:'/article',
      name:'article',
      component:article,
      children:articleRouters
    },

  ]
})
