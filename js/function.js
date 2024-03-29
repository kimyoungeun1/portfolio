const $indicators = document.querySelectorAll('#slides>.slides-pagination>li>a');
const $container = document.querySelector('#slides>.slides-container');
const $btnPrev = document.querySelector('#slides>.slides-navigation.slides-prev');
const $btnNext = document.querySelector('#slides>.slides-navigation.slides-next');

console.log($container);

let nowIdx = 1;//현재 보여지고 있는 슬라이드의 인덱스 번호
let oldIdx = nowIdx;//직전

$indicators.forEach(function($indicator, idx){
	$indicator.addEventListener('click', function(evt){
		evt.preventDefault();
		
		oldIdx = nowIdx-1;
		nowIdx = idx+1;
		
		//활성화표시
		$indicators[idx].parentElement.classList.add('on');
		$indicators[oldIdx].parentElement.classList.remove('on');
		
		//컨테이너 이동
		$container.style.left = -(100*nowIdx)+'%';
	});
});

//이전버튼
$btnPrev.addEventListener('click', function(evt){
	evt.preventDefault();
	
	oldIdx = nowIdx;
	nowIdx--;
	
	//컨테이너 이동
	$container.style.left = -(100*nowIdx)+'%';	

	if(nowIdx === 0){
		setTimeout(function(){
			$container.style.transition = 'none';
			$container.style.left = '-500%';
		},400);
		nowIdx = 5;
	}

	$container.style.transition = 'all 0.4s ease-in-out';

	//활성화표시
	//$indicators[nowIdx].parentElement.classList.add('on');
	//$indicators[oldIdx].parentElement.classList.remove('on');
	
});

//다음버튼
$btnNext.addEventListener('click', function(evt){
	evt.preventDefault();
	
	oldIdx = nowIdx;
	
	if(nowIdx<4){
		nowIdx++;
	}else{
		nowIdx=0;
	}
	
	//활성화표시
	$indicators[nowIdx].parentElement.classList.add('on');
	$indicators[oldIdx].parentElement.classList.remove('on');
	
	//컨테이너 이동
	$container.style.left = -(100*nowIdx)+'%';	
});