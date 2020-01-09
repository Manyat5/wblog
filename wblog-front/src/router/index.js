import Vue from 'vue'
import Router from 'vue-router'
// import HelloWorld from '@/components/HelloWorld'
import personal from "@/views/personal";
import article from "@/views/article";
import setting from "@/views/setting";

Vue.use(Router)

export default new Router({
  routes: [
    {
      path:'/personal',
      name:'personal',
      component: personal
    },
    {
      path:'/setting',
      name:'setting',
      component: setting
    },
    {
      path:'/article',
      name:'article',
      component: article
    }

  ]
})
