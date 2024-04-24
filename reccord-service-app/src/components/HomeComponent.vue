<template>
  <div class="container-fluid main-container">
      <div class="main-lext">
          <v-menu />
      </div>
      <div class="main-right">
        <main-content />
        
      </div>
  </div>
</template>

<script>
import VMenu from './menu/VMenu.vue'
import MainContent from './MainContent.vue'

export default {
  name: 'HomeComponent',
  components:{
    VMenu,
    MainContent,
  },
  props: {
  }
}
</script>

<style scoped>

  .main-container{
    background: #e1e1e1;
    display: flex;
    margin: 0px;
    padding: 0px;
    min-height: 100vh;
    width: 100%;
  }
  .main-lext{
    border: none;
    background: #ffffff;
    margin: 0px;
    padding: 0px;
    width: 15%;
  }

  .main-right{
    border: none;
    border-radius: 8px;
    background: #ffffff;
    margin: 1em;
    padding: 0px;
    width: 85%;
    box-sizing: border-box;
  }

</style>
