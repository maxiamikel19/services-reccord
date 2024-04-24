<template>
    <div class="main">
        <div class="main-title">
            <h3>Services managment system</h3>
        </div>
        <div class="main-button">
            <p>Modules</p>
            <div class="btn-group menu-btn">
                <button class="btn btn-secondary dropdown-toggle" type="button" data-bs-toggle="dropdown" aria-expanded="false">
                    Clients
                </button>
                <ul class="dropdown-menu">
                    <li><a class="dropdown-item" href="#">Create new</a></li>
                </ul>
            </div>
            <div class="btn-group menu-btn">
                <button class="btn btn-secondary dropdown-toggle" type="button" data-bs-toggle="dropdown" aria-expanded="false">
                    Services
                </button>
                <ul class="dropdown-menu">
                    <li><a class="dropdown-item" href="#">Create new</a></li>
                </ul>
            </div>
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
            border:none;
            border-bottom: solid 5px $blue;
            background: $dark;
            color: $yellow;
            width: 100%;
            padding: 1em .5em 0 .5em;
        }
    
        .main-title h3{
           text-align: center;
           padding: 12px;
           font-size: 1em;
           text-transform: capitalize;
        }

        .main-button{
            display: flex;
            align-items: center;
            justify-content: center;
            flex-direction: column;
            width: 100%;
            margin: 0 auto;
            border:none;
        }

        .menu-btn{
            width: 90%;
            background:transparent;
            margin-bottom: 17px;
        }

        .dropdown-toggle{
            background: transparent;
            border: none;
            border-bottom: solid 1px $dark;
            color: $dark;
            padding-bottom: 10px;
        }

        .notes{
            border: none;
            width: 100%;
            text-align: center;
            padding: 10px;
        }
        .notes p{
            font-size: 13px;
            font-weight: 600;
        }
</style>