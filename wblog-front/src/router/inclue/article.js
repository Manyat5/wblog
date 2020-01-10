/**
 * 文章的子路由
 */
import addArticle from "../../views/article/addArticle";
import listArticle from "../../views/article/listArticle";
import editArticle from "../../views/article/editArticle";

const articleRouters=[
  {
    path:'/',
    redirect:'list',
  },
  {
    path:'list',
    name:'list',
    component: listArticle
  },
  {
    path:'add',
    name:'addArticle',
    component: addArticle
  },
  {
    path:'edit',
    name:'editArticle',
    component: editArticle
  },
]
export default articleRouters
