<template>
  <el-table :data="articles" style="width: 100%">

    <el-table-column label="标题" width="180" >
      <template slot-scope="scope">
        <el-tag size="medium">{{ scope.row.title }}</el-tag>
      </template>
    </el-table-column>

    <el-table-column label="摘要" width="250" prop="summary"></el-table-column>

    <el-table-column label="最后编辑时间" width="200">
      <template slot-scope="scope">
        <i class="el-icon-time"></i>
        <span style="margin-left: 10px">{{ scope.row.editTime }}</span>
      </template>
    </el-table-column>

    <el-table-column label="操作">
      <template slot-scope="scope">
        <el-button size="mini" @click="handleEdit(scope.$index, scope.row)">编辑</el-button>
        <el-button size="mini" type="danger" @click="handleDelete(scope.$index, scope.row)">删除</el-button>
      </template>
    </el-table-column>

  </el-table>
</template>

<script>
    import api from '../../api/article'
    export default {
        data() {
            return {
                articles: []
            }
        },
        methods: {
            handleEdit(index, row) {
                // alert(row);
                this.$router.push({
                    name:'editArticle',
                    params: row
                });
                // console.log(index, row);
            },
            handleDelete(index, row) {
                console.log(index, row);
            }
        },
        beforeMount() {
            api.getAllArticle().then(result=>{
                // alert(JSON.stringify(result));
                this.articles=result.data.data;
            });
        }

    }
</script>

<style scoped>

</style>
