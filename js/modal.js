$(document).ready(function() { // Gets the video src from the data-src on each button
    var $videoSrc = $('.video-btn').data("src");
    $('#myModal').modal();

    console.log($videoSrc); // when the modal is opened autoplay it  
    $('#myModal').on('shown.bs.modal', function(e) {
        $("#video").attr('src', $videoSrc + "?autoplay=1&amp;modestbranding=1&amp;showinfo=0"); // set the video src to autoplay and not to show related video. Youtube related video is like a box of chocolates... you never know what you're gonna get
    })
    $('#myModal').on('hide.bs.modal', function(e) { // stop playing the youtube video when I close the modal
        $("#video").attr('src', $videoSrc); // a poor man's stop video
    })
});