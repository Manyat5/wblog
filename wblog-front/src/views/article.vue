<template>
    <div>
      <h3>文章管理</h3>
      <router-link to="/article/add">
        <el-button type="primary" >
          添加文章
        </el-button>
      </router-link>

      <router-link to="/article/list">
        <el-button type="primary" >
          显示文章
        </el-button>
      </router-link>

      <router-view></router-view>
    </div>
</template>

<script>

</script>

<style scoped>

</style>
