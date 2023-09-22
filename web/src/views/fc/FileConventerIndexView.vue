<!-- <template>
    <ContentField>
        FileConventerIndexView
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
<style scoped></style> -->

<template>
    <ContentField>
        <div class="h1">File Conventer</div>
        <div class="h2">Easy-to-use online File Conventer</div>


        <div class="items">
            <a class="item " href="https://online-video-cutter.com/merge-videos">
                <div class="img universe-vcutter-vmerge"></div>
                <div class="name">Merge Videos</div>
            </a>
            <a class="item " href="https://online-video-cutter.com/add-music-to-video">
                <div class="img universe-vcutter-addaudio"></div>
                <div class="name">Add Audio to Video</div>
            </a>
            <a class="item " href="https://online-video-cutter.com/">
                <div class="img universe-vcutter-vtrim"></div>
                <div class="name">Trim Video</div>
            </a>
            <a class="item " href="https://online-video-cutter.com/add-image-to-video">
                <div class="img universe-vcutter-addimage"></div>
                <div class="name">Add Image to Video</div>
            </a>
            <a class="item " href="https://online-video-cutter.com/add-text-to-video">
                <div class="img universe-vcutter-addtext"></div>
                <div class="name">Add Text to Video</div>
            </a>
            <a class="item " href="https://online-video-cutter.com/remove-logo">
                <div class="img universe-vcutter-delogo"></div>
                <div class="name">Remove Logo from Video</div>
            </a>
            <a class="item " href="https://online-video-cutter.com/crop-video">
                <div class="img universe-vcutter-vcrop"></div>
                <div class="name">Crop Video</div>
            </a>
            <a class="item " href="https://online-video-cutter.com/rotate-video">
                <div class="img universe-vcutter-vrotate"></div>
                <div class="name">Rotate Video</div>
            </a>
            <a class="item " href="https://online-video-cutter.com/flip-video">
                <div class="img universe-vcutter-vflip"></div>
                <div class="name">Flip video</div>
            </a>
            <a class="item " href="https://online-video-cutter.com/resize-video">
                <div class="img universe-vcutter-vresolution"></div>
                <div class="name">Resize Video</div>
            </a>
            <a class="item " href="https://online-video-cutter.com/loop-video">
                <div class="img universe-vcutter-vloop"></div>
                <div class="name">Loop Video</div>
            </a>
            <a class="item " href="https://online-video-cutter.com/volume">
                <div class="img universe-vcutter-vvolume"></div>
                <div class="name">Change Volume</div>
            </a>
            <a class="item " href="https://online-video-cutter.com/change-video-speed">
                <div class="img universe-vcutter-vspeed"></div>
                <div class="name">Change Video Speed</div>
            </a>
            <a class="item " href="https://online-video-cutter.com/stabilize-video">
                <div class="img universe-vcutter-stabilize"></div>
                <div class="name">Stabilize Video</div>
            </a>
            <a class="item " href="https://webcamera.io/">
                <div class="img universe-webcamera"></div>
                <div class="name">Video Recorder</div>
            </a>
        </div>
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
.h1 {
    font-size: 40px;
    font-weight: 600;
    line-height: 1;
    display: flex;
    justify-content: center;
    align-items: center;
    margin-top: 60px;
    margin-bottom: 15px;
}

.h2 {
    font-size: 20px;
    display: flex;
    justify-content: center;
    align-items: center;
    margin-top: 5px;
    margin-bottom: 15px;
}

.items {
    max-width: 990px;
    margin: 0 auto;
    display: flex;
    flex-direction: row;
    flex-wrap: wrap;
    justify-content: center;
    align-items: center;
    margin-top: 41px;

}

.items a.item .img {
    width: 110px;
    height: 110px;
    background-size: 110px;
    background-repeat: no-repeat;
    margin-bottom: 11px;
    display: block;
    margin-left: auto;
    margin-right: auto;
}

.items a.item {
    z-index: 5;
    position: relative;
    text-align: center;
    background-color: #f7f9fa;
    box-sizing: border-box;
    color: #000;
    text-decoration: none;
    border-radius: 10px;
    padding-top: 15px;
    cursor: pointer;
    width: 175px;
    min-height: 200px;
    margin-bottom: 23px;
    margin-right: 23px;
}


.items a.item:hover {
    /* background-color: #ffee55; */
    background-color: #a3d4f6;
}

.items a.item .name {
    font-size: 15px;
    white-space: pre-line;
    padding-left: 19px;
    padding-right: 19px
}

.items a.item .img {
    width: 110px;
    height: 110px;
    background-size: 110px;
    background-repeat: no-repeat;
    margin-bottom: 11px;
    display: block;
    margin-left: auto;
    margin-right: auto;
}
</style>