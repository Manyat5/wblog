import axios from 'axios'

export default {
  /**
   * 获取文章列表
   */
  getAllArticle(){
      return axios.get("article/list/1");
  },
  /**
   * 编辑博客
   * @param uid 用户的id
   */
  editArticle(article){
    return axios.put("article/edit",article);
  },
  /**
   * 新建博客
   */
  addArticle(article){
    return axios.put("article/add",article);
  },


}
