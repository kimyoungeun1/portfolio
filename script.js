$(function(){
    //메뉴
    $("nav>ul>li").mouseenter(function(){
        $(".sub").stop().slideDown()
    })
    $("nav>ul>li").mouseleave(function(){
        $(".sub").stop().slideUp()
    })

    //슬라이드
    function slide(){
        $(".slide ul").animate({top:"-300px"},1000,function(){
            $(".slide ul").append($(".slide ul li").first())
            $(".slide ul").css({top:0})
        })
    }
    setInterval(slide, 2000)

    //탭메뉴
    $(".tabmenu>li").click(function(){
        $(".tabmenu>li").removeClass("on")
        $(this).addClass("on")

        var t = 0
        t = $(this).index()
        $(".tabcon").hide()
        $(".tabcon").eq(t).show()
        return false;
    })

    //팝업
    $(".pp").click(function(){
        $(".popup").show()
        return false;
    })
    $("button").click(function(){
        $(".popup").hide()
    })
})