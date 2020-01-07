import Vue from 'vue'
import Router from 'vue-router'
// import HelloWorld from '@/components/HelloWorld'
import index from "@/views/index";

Vue.use(Router)

export default new Router({
  // 路由设置
  routes: [
    // { 开始给的案例
    //   path: '/',
    //   name: 'HelloWorld',
    //   component: HelloWorld
    // },
    {
      path: '/',
      name: 'index',
      component: index
    }

  ]
})
