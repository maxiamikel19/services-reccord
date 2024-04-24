<template>
  <div class="container">
    <local-service />
  </div>
</template>

<script>
import LocalService from './service/LocalService.vue'
export default {
  name: 'HomeComponent',
  components:{
    LocalService
  },
  props: {
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

</style>
