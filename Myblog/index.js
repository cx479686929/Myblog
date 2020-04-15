var app=new Vue({
    el:'#photoapp',
    data:{
        photos:[{},{},{},{},{},{}]
    },

    mounted(){
        this.getJoke();
        ScrollReveal().reveal('.photo',{reset: true})
    },
    methods:{
        getJoke:function(){
            const that=this;
            axios.get("http://192.168.1.4:8080/getAllPhotos").then(
                function(response){
                    console.log(response.data);
                    console.log(response.data['photos']);
                    that.photos=response.data['photos'];
                },
                function(err){}
            )
        }
    }



});
var app=new Vue({
    el:'#articleapp',
    data:{
        articles:[]
    },

    mounted(){
        this.getJoke();
    },
    methods:{
        getJoke:function(){
            const that=this;
            axios.get("http://192.168.1.4:8080/getAllArticles").then(
                function(response){
                    console.log(response.data);
                    console.log(response.data['articless']);
                    that.articles=response.data['articles'];
                },
                function(err){}
            )
        }
    }



})



const headerEl=document.querySelector("header");
window.addEventListener("scroll",()=>{
    let height=headerEl.getBoundingClientRect().height;
    if(window.pageYOffset - height > 100){
        if(!headerEl.classList.contains("sticky")){
            headerEl.classList.add("sticky");
        }
    }else{
        headerEl.classList.remove("sticky");
    }
}

);



const glide =new Glide(".glide");
const captionEl=document.querySelectorAll(".slide-caption");


glide.on(["mont.after","run.after"],()=>{
    const caption=captionEl[glide.index];
    anime({
        targets:caption.children,
        opacity:[0,1],
        duration:400,
        delay:anime.stagger(400,{start:300}),
        translateY:[anime.stagger([40,10],0)]
    });
});

glide.on("run.before",()=>{
    document.querySelectorAll(".slide-caption > *").forEach(el=>{
        el.style.opacity=0;
    });
});

glide.mount();

const staggeringOption = {
    delay:300,
    distance:"50px",
    duration:500,
    easing:"ease-in-out",
    origin:"bottom"
};

ScrollReveal().reveal(".photo",{ ... staggeringOption, interval:350});

const dataSectionEl=document.querySelector(".data-section");
ScrollReveal().reveal(".data-section",{ 
 beforeReveal:()=>{
     anime({
         targets:".data-piece .num",
         innerHTML:el=>{
             return[0,el.innerHTML];
         },
         duration:2000,
         round:1,
         easing:"easeInExpo"
     });
     dataSectionEl.style.backgroundPosition=`center calc(50% - ${dataSectionEl.getBoundingClientRect().bottom/3}px)`;
 }   
});


window.addEventListener("scroll",()=>{
    const bottom =dataSectionEl.getBoundingClientRect().bottom;
    const top=dataSectionEl.getBoundingClientRect().top;
    if(bottom>=0&&top<=window.innerHeight){
       // console.log("uyyyhuh");
        dataSectionEl.style.backgroundPosition=`center calc(50% - ${bottom/3}px)`;
    }
});

const scroll = new SmoothScroll('nav a[href*="#"], .scrollToTop a[href*="#"]',{
    header:"header",
    offset:80
});