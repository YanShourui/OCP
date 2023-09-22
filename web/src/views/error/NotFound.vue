<template>
    <ContentField>
        <div class="h_error">404</div>
        <div class="h_errordown">Oh no!</div>
        <div class="h_errordown">Page... not found!</div>
    </ContentField>
</template>
<script>
import ContentField from '../../components/ContentField.vue'

export default {
    components: {
        ContentField
    }
}
</script>
<style scoped>
.h_error {
    font-size: 90px;
    font-weight: bold;
    display: flex;
    justify-content: center;
    align-items: center;
    margin-top: 10px;
    margin-bottom: 15px;
}

.h_errordown {
    font-size: 40px;
    font-weight: bold;
    display: flex;
    justify-content: center;
    align-items: center;
    margin: 5px
}
</style>