<template>
  <el-card style="height: 610px;">
    <quill-editor v-model="htmlContent" ref="myQuillEditor" style="height: 500px;":options="editorOption"></quill-editor>
  </el-card>
</template>
<script>
    import {quillEditor} from 'vue-quill-editor'
    import 'quill/dist/quill.core.css'
    import 'quill/dist/quill.snow.css'
    import 'quill/dist/quill.bubble.css'
    export default {
        name: "editor",
        props:['value'],
        data(){
            return{
                htmlContent:this.value,
                editorOption:{}
            }
        },
        components: {
            quillEditor
        },
        watch:{
            htmlContent(val,oldVal){
                this.$emit('refresh',val);
            }
        }
    }
</script>

<style scoped>

</style>
