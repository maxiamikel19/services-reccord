<template>
    <div class="main">
        <div class="main-title">
            <h3>Services managment</h3>
        </div>
        <div class="btn-group ">
            <button class="btn btn-secondary dropdown-toggle" type="button" data-bs-toggle="dropdown" aria-expanded="false">
                Dropdown
            </button>
            <ul class="dropdown-menu">
                <li><a class="dropdown-item" href="#">Menu item</a></li>
                <li><a class="dropdown-item" href="#">Menu item</a></li>
                <li><a class="dropdown-item" href="#">Menu item</a></li>
            </ul>
        </div>
        <div class="notes">
            <p>App v-001</p>
        </div>
    </div>
</template>

<script>
    export default {
        name:'VMenu'
    }
</script>

<style lang="scss" scoped>
@import '../../styles/global.scss';
    .main{
        background: transparent;
        height: 100%;
        align-items: center;
        display: flex;
        flex-direction: column;
        align-items: center;
        justify-content: space-between;
     }

    .main-title{
            border: solid 1px $color-1;
        }
</style>