<template>
    <div class="container main-content">
        <h1>Main Content</h1>
        <local-service />
    </div>
</template>

<script>
import LocalService from './service/LocalService.vue'
    export default {
        name:'MainContent',
        components:{
            LocalService
        }
    }
</script>

<style  scoped>
    .main-content{
        margin: 10px;
        min-width:100%;
        border: solid 1px;
    }
</style>