<template>
    <div class="container-fluid">
        <h1>Titulo</h1>
        <table class="table table-spriped">
            <thead>
                <th>COD</th>
                <th>FATO</th>
                <th>DESCRIÇÂO</th>
                <th>CUSTO</th>
                <th>DATA LANC.</th>
                <th>CLIENTE</th>
                <th>CPF</th>
                <th>AÇAÔ</th>
            </thead>
            <tbody>
                <tr v-for="service in services" :key="service.id">
                    <td>{{ service.id }}</td>
                    <td>{{ service.name }}</td>
                    <td>{{ service.description }}</td>
                    <td>{{ service.cost }}</td>
                    <td>{{ service.serviceDate }}</td>
                    <td>{{ service.client.name }}</td>
                    <td>{{ service.client.cpf }}</td>
                </tr>
            </tbody>
        </table>
    </div>
</template>

<script>
import LocalServiceService from '../../services/LocalServiceService';
    export default {
        name:'LocalService',
        data(){
            return{
                services : []
            }            
        },
        methods:{
            getServices(){
                LocalServiceService.getServices().then((response) => {
                    this.services = response.data;
                    console.log(this.services)
                })
            }
        },
        created(){
            this.getServices()
        }
    }
</script>

<style  scoped>

</style>