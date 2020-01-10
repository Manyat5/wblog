<template>
  <div>
    <h3>修改文章</h3>
    请输入标题：<el-input v-model="article.title"></el-input>
    <editor v-model="article.htmlContent" @refresh="refresh"></editor>
    <el-button type="success" @click="onsubmit">修改</el-button>
  </div>
</template>

<script>
  import editor from "../../components/editor";
  import api from "../../api/article";
    export default {
        name: 'editArticle',
        components: {
            editor,
        },
        data(){
            return{
                article:{},
            }
        },
        created() {
            this.article=this.$route.params;
        },
        methods:{
            onsubmit(){
                api.editArticle(this.article).then(result=>{
                    if(result.data.data){
                        this.$message({
                            message:'修改成功！',
                            type:"success"
                        })
                    }else {
                        this.$message({
                            message:'修改失败！',
                            type:"error"
                        })
                    }
                    this.$router.push('list')
                })
            },
            refresh(val){//子组件刷新文章内容
                this.article.htmlContent=val;
            }
        }
    }
</script>

<style scoped>

</style>
