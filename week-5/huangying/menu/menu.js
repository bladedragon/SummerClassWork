let column=document.getElementsByClassName('column');
let cartoonMenu0=document.getElementsByClassName('cartoonMenu0');
let cartoonMenu=document.getElementsByClassName('cartoonMenu');

let fan0=document.getElementsByClassName('fan0');
let create0=document.getElementsByClassName('create0');
let music0=document.getElementsByClassName('music0');
let dance0=document.getElementsByClassName('dance0');
let game0=document.getElementsByClassName('game0');
let science0=document.getElementsByClassName('science0');




let rightShow=function(){
    this.getElementsByClassName('right')[0].style.display='block';
    this.style.animation="rightMove 0.5s forwards";
};
let rightHidden=function(){
    this.getElementsByClassName('right')[0].style.display='none';
    this.style.animation="rightOut 0.5s forwards";
};

// let columnMove=function(x){
//     document.getElementsByClassName(x)[0].style.display='block';
// };
// let columnOut=function(x){
//     document.getElementsByClassName(x)[0].style.display='none';
// };

function columnMove(x){
    document.getElementsByClassName(x)[0].style.display='block';
}
function columnOut(x){
    document.getElementsByClassName(x)[0].style.display='none';
}

// column[0].onmousemove=columnMove('cartoonMenu');
// column[0].onmouseout=columnOut('cartoonMenu');

// column[1].onmousemove=columnMove('fan');
// column[1].onmouseout=columnOut('fan');

// cartoonMenu[0].onmousemove=columnMove;
// cartoonMenu[0].onmouseout=columnOut;


cartoonMenu0[0].onmousemove=rightShow;
cartoonMenu0[1].onmousemove=rightShow;
cartoonMenu0[2].onmousemove=rightShow;
cartoonMenu0[3].onmousemove=rightShow;

cartoonMenu0[0].onmouseout=rightHidden;
cartoonMenu0[1].onmouseout=rightHidden;
cartoonMenu0[2].onmouseout=rightHidden;
cartoonMenu0[3].onmouseout=rightHidden;

fan0[0].onmousemove=rightShow;
fan0[1].onmousemove=rightShow;
fan0[2].onmousemove=rightShow;
fan0[3].onmousemove=rightShow;
fan0[4].onmousemove=rightShow;
fan0[5].onmousemove=rightShow;

fan0[0].onmouseout=rightHidden;
fan0[1].onmouseout=rightHidden;
fan0[2].onmouseout=rightHidden;
fan0[3].onmouseout=rightHidden;
fan0[4].onmouseout=rightHidden;
fan0[5].onmouseout=rightHidden;

create0[0].onmousemove=rightShow;
create0[1].onmousemove=rightShow;
create0[2].onmousemove=rightShow;
create0[3].onmousemove=rightShow;
create0[4].onmousemove=rightShow;
create0[5].onmousemove=rightShow;

create0[0].onmouseout=rightHidden;
create0[1].onmouseout=rightHidden;
create0[2].onmouseout=rightHidden;
create0[3].onmouseout=rightHidden;
create0[4].onmouseout=rightHidden;
create0[5].onmouseout=rightHidden;

music0[0].onmousemove=rightShow;
music0[1].onmousemove=rightShow;
music0[2].onmousemove=rightShow;
music0[3].onmousemove=rightShow;
music0[4].onmousemove=rightShow;
music0[5].onmousemove=rightShow;
music0[6].onmousemove=rightShow;

music0[0].onmouseout=rightHidden;
music0[1].onmouseout=rightHidden;
music0[2].onmouseout=rightHidden;
music0[3].onmouseout=rightHidden;
music0[4].onmouseout=rightHidden;
music0[5].onmouseout=rightHidden;
music0[6].onmouseout=rightHidden;

dance0[0].onmousemove=rightShow;
dance0[1].onmousemove=rightShow;
dance0[2].onmousemove=rightShow;

dance0[0].onmouseout=rightHidden;
dance0[1].onmouseout=rightHidden;
dance0[2].onmouseout=rightHidden;

game0[0].onmousemove=rightShow;
game0[1].onmousemove=rightShow;
game0[2].onmousemove=rightShow;
game0[3].onmousemove=rightShow;
game0[4].onmousemove=rightShow;
game0[5].onmousemove=rightShow;
game0[6].onmousemove=rightShow;
game0[7].onmousemove=rightShow;

game0[0].onmouseout=rightHidden;
game0[1].onmouseout=rightHidden;
game0[2].onmouseout=rightHidden;
game0[3].onmouseout=rightHidden;
game0[4].onmouseout=rightHidden;
game0[5].onmouseout=rightHidden;
game0[6].onmouseout=rightHidden;
game0[7].onmouseout=rightHidden;

science0[0].onmousemove=rightShow;
science0[1].onmousemove=rightShow;
science0[2].onmousemove=rightShow;
science0[3].onmousemove=rightShow;
science0[4].onmousemove=rightShow;
science0[5].onmousemove=rightShow;
science0[6].onmousemove=rightShow;

science0[0].onmouseout=rightHidden;
science0[1].onmouseout=rightHidden;
science0[2].onmouseout=rightHidden;
science0[3].onmouseout=rightHidden;
science0[4].onmouseout=rightHidden;
science0[5].onmouseout=rightHidden;
science0[6].onmouseout=rightHidden;