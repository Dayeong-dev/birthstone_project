package com.example.birthstone.dao;

import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.birthstone.dto.BirthstoneDTO;

@SpringBootTest
public class TestBirthstoneDao {
	
	@Autowired
	private IBirthstoneDao birthstoneDao;
	
	// @Test
	public void setDummies() {
		String[] names = {"가넷", "자수정", "아쿠아마린", "다이아몬드", "에메랄드", "진주", "루비", "페리도트", "사파이어", "오팔", "토파즈", "터키석"};
		String[] engNames = {"Garnet", "Amethyst", "Aquamarine", "Diamond", "Emerald", "Pearl", "Ruby", "Peridot", "Sapphire", "Opal", "Topaz", "Turquoies"};
		
		String[] description = {
				"가넷, 즉 석류석은 1월의 탄생석으로서 루비와 비슷한 붉은 빛을 띄고 있습니다. 그러므로 가넷과 루비는 혼동하기가 매우 쉽습니다. 석류석이라고 하면 오직 투명한 암적색 Stone으로만 생각하기 쉬우나 이것은 빨간색을 비롯하여 주황색, 노란색, 밤색, 연두색, 초록색, 자주색, 무색 그리고 검은색 등 청색을 제외한 여러가지 아름다운 색을 가진 Stone을 의미합니다.", 
				"자수정은 성실과 마음의 평화를 상징하는 2월의 탄생석입니다. 이것은 무색에 가까운 옅은 보라색으로부터 짙은 자주색에 이르는 석영의 일종으로서 반귀석중에서는 많은 사람들에게 가장 인기 있는 Stone입니다. 이 Stone은 불꽃이 적고 표면 광택은 대단치 않아도 그 색의 폭이 굉장하다 할 수 있습니다.", 
				"아쿠아마린 맑고 푸른 바다를 연상케 하는 Stone, 그리고 귀에 대면 마치 파도소리라도 들린 것 같은 시원한 느낌을 주는 보석이 바로 남청색의 녹주석인 남옥, 즉 3월의 탄생석인 아쿠아마린입니다. 아쿠아마린이란 단어 자체가 물을 뜻하는 아쿠아 (Aqa)와 바다라는 뜻의 마린(Marine)이 합쳐진 것이므로서 보석의 이름에서 푸른 바다의 물빛을 연상할 수 있습니다. 아쿠아마린은 인류에게 오랫동안 영원한 젊음과 행복을 상징하는 Stone, 그리고 희망과 건강을 갖게 하는 Stone으로 여겨져왔습니다.", 
				"보석의 왕 다이아몬드는 탄소의 결정물에 지나지 않지만 지구상에 존재하는 천연 광물질들중 가장 강한 것으로 알려져 있습니다. 다이아몬드는 옛날 얼음이 Stone으로 변한 것이라고 합니다. 사막에서 갈증에 허덕이던 어머니가 다이아몬드를 넣은 꿀을 마시자 금새 다 죽어가던 아이에게 젖을 줄 수 있어 아이를 살릴 수 있었다는 전설이 있습니다. ", 
				"에메랄드는 베릴(Beryl)이라는 광물 중에서 가장 대표적인 초록색 보석으로서 대자연의 아름다움을 자랑하는 신록의 상징보석입니다. 초록색 Stone의 왕으로 꼽히는 에메랄드는 수많은 보석 중에서 최초의 장식용으로 쓰여졌으며 이집트 여왕 클레오파트라가 가장 즐기던 보석이기도 했습니다. 에메랄드는 고가에 속하는 보석으로 예전에는 이것을 지니고 있으면 사랑이 변치않으며, 다가오는 앞날을 예측할 수 있는 능력이 생긴다고 하여 애용되어져 왔습니다.", 
				"진주는 바다에서 발견된 보석으로 건강과 장수, 그리고 부를 상징하는 탄생석입니다. 조가비 속에서 숨쉬며 자라나는 살아 있는 보석, 그것이 바로 은은하고 신비스러운 빛으로 많은 사람들의 사랑을 받는 진주입니다. ", 
				"루비는 정열적인 애정을 나타내는 사랑의 Stone으로 7월의 탄생석입니다. 루비란 라틴어의 루브(Rubrum)에서 유래된 말이며 빨갛다는 의미를 가지고 있습니다. 코런덤(Corundum), 즉 알루미늄 옥사이드 강옥 중에서 붉은색의 투명한 Stone을 루비라고 부르며, 그외의 것은 모두 사파이어라고 부릅니다. 루비는 코런덤 중에서 가장 고가로 취급되는 매우 아름다운 보석입니다.", 
				"페리도트는 황록색의 투명한 아름다운 보석으로 우리말로는 감람석이라 불리웁니다. 감람석은 사도닉스(Sardonyx), 즉 붉은색 줄무늬 마노와 함께 8월의 탄생석에 해당됩니다. 부부의 행복, 친구와의 화합을 가져다준다는 페리도트는 용암을 만드는 광물의 하나입니다. 그리고 때로는 운석 중에서도 발견됩니다.", 
				"사파이어는 청명한 가을 하늘을 연상케 하는 푸른색의 보석으로서 9월의 탄생석입니다. 사파이어는 청색이 절대적으로 많으며 루비에 비하여 함유물이 적고 그 투명도가 높으며 루비에 비하여 비교적 큰 원석이 산출됩니다. 세계 최대 사파이어 원석은 2천 3백 2캐럿으로 1935년 오스트레일리아에서 산출된 바 있습니다.", 
				"오팔은 마치 작은 무지개를 보는 것과도 같은 아름다운 색깔을 간직한 10월의 탄생석입니다. Stone 속에서 분수처럼 솟아오르는 찬란한 빛깔은 오팔이 아닌 다른 보석에서는 찾아보기 어렵습니다. 그러므로 오팔과 다른 보석을 구별하기는 매우 쉬운 일입니다. 오팔은 그리이스어의 오팔리오스(Opallios)에서 온 말로 '귀한 Stone'이란 뜻을 가지고 있습니다. ", 
				"맑고도 아름다운 광석의 일종인 토파즈는 11월의 탄생석입니다. 희망과 결백, 그리고 우애를 상징하는 토파즈는 마치 호랑이 눈빛 같은 갈색이 있는가 하면, 공작의 눈빛 같은 분홍색도 있으며 성난 고양이의 눈동자를 연상케 하는 초록색도 있습니다.", 
				"터키석 래피스 레줄라와 함께 인류에게 가장 오랫동안 사랑받아온 보석입니다. 터어키의 Stone을 의미하는 프랑스어 피에르 터쿼이즈(Pierre Tourques)에서 이름이 유래되었습니다. 13세기에 만들어진 터키석이란 이름은 이 물질이 아마도 처음에는 터어키 원산지에서 유럽으로 이동했다는 사실을 반영한 것 같습니다."
		};
		
		IntStream.rangeClosed(0, 11).forEach(i -> {
			int month = i + 1;
			
			BirthstoneDTO birthstoneDTO = BirthstoneDTO.builder()
					.month(month)
					.name(names[i])
					.engName(engNames[i])
					.description(description[i])
					.imageURL("https://cafe24.poxo.com/ec01/bettershop/pdHAR3Nfo463PahlnCQH4kgxUHaOOM8ocnCbkxY0IXo/IaFhYopE1nOgcj+Nq2hA3jG5AveXOMSmifLxJw5MkQ==/_/web/upload/m_SG/img/n_img/" + month + "m_img.gif")
					.build();
			
			birthstoneDao.setBirthstone(birthstoneDTO);
		});
	}
	
	@Test
	public void testUpdate() {
		String name = "가넷";
		int month = 1;
		
		birthstoneDao.updateBirthstoneName(name, month);
		
		BirthstoneDTO birthstone = birthstoneDao.getBirthstoneByMonth(month);
		System.out.println(birthstone);
	}
}
