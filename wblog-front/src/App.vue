<template>
<div id="app">
  <el-container>
<!--    导航菜单-->
    <el-aside>
      <h3>菜单</h3>
      <el-menu default-active="1"  router>

        <el-menu-item index="1" route="/article">
            <i class="el-icon-document"></i>
            <span>文章管理</span>
        </el-menu-item>

        <el-menu-item index="2" route="/personal">
          <i class="el-icon-menu"></i>
          <span slot="title">个人中心</span>
        </el-menu-item>

        <el-menu-item index="3" route="/setting">
          <i class="el-icon-setting"></i>
          <span slot="title">设置</span>
        </el-menu-item>
      </el-menu>
    </el-aside>
    <!--主要内容-->
    <el-main>
      <router-view/>
    </el-main>

  </el-container>
</div>
</template>

<script>
export default {
  name: 'App',
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  color: #2c3e50;
  margin-top: 1%;
}
#menu{
  width: 35%;
}
#page{
}
</style>
