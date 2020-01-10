<template>
  <div>
    <h3>编辑你的想法</h3>
    请输入标题：<el-input v-model="article.title"></el-input>
    <editor v-model="article.htmlContent" @refresh="refresh"></editor>
    <el-button type="success" @click="onsubmit">提交</el-button>
  </div>
</template>

<script>
  import api from "../../api/article"
    import editor from "../../components/editor";
    export default {
        name: 'addArticle',
        components: {
            editor
        },
        data() {
            return {
                article:{
                    title:'',
                    htmlContent:'',
                    uid:''
                },
            }
        },
        methods:{
            onsubmit(){
                api.addArticle(this.article).then(result=>{
                    if(result.data.data){
                        this.$message({
                            message:'成功创建文章！',
                            type:"success"
                        })
                    }else {
                        this.$message({
                            message:'创建失败！',
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
