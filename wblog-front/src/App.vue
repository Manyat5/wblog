<template>
  <div id="app">
    <div id="menu">
      <el-col :span="12">
        <h2>个人菜单</h2>

        <el-menu default-active="2"   router="true">
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
      </el-col>
    </div>
    <div id="page">
      <router-view/>
    </div>
  </div>
</template>

<script>
export default {
  name: 'App',
    methods:{

        handleOpen(){
          // alert("open!");
        }
    }
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
