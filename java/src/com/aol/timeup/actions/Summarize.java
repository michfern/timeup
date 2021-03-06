package com.aol.timeup.actions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import org.jsoup.Jsoup;

import com.aol.timeup.utils.MapUtil;

public class Summarize {

	//static String content="As the seemingly endless GOP nomination fight grinds on, it's becoming clearer who President Obama's most formidable opponent is likely to be: himself.\n\nSometimes a long, hard-fought primary is good for a party, forcing the candidates to become stronger, better, and more responsive to the electorate. And sometimes a long, hard-fought primary is bad for a party. Like this year's GOP race.\n\nIt's not surprising that <a href=\"http://www.intrade.com/v4/markets/contract/?contractId=743474\" target=\"_hplink\">on Intrade</a> the chances of President Obama getting reelected currently stand at around 60 percent, and that crack prognosticator Nate Silver has also <a href=\"http://fivethirtyeight.blogs.nytimes.com/2012/02/15/the-fundamentals-now-favor-obama/\" target=\"_hplink\">listed</a> President Obama \"as about a 60 percent favorite\" against Mitt Romney. And that was in mid-February, before the GOP's bizarre equation of religious liberty with curtailing access to contraception -- and weeks before Barbara Bush <a href=\"http://www.huffingtonpost.com/2012/03/06/barbara-bush-2012-campaign-election-first-lady_n_1322995.html\" target=\"_hplink\">summed up</a> what many in the GOP establishment (not to mention outside it) are no doubt thinking: \"I think it's been the worst campaign I've ever seen in my life.\"\n\nSo for me this election now has two tracks: 1) Obama vs. the GOP nominee; and 2) Obama vs. Obama.\n\nOf course, many things can happen between now and November, and I want to be clear that I think it's crucial for the country -- and the world -- that the president defeat any of his likely opponents. But if present trends continue, and the outcome of the first track appears more and more settled, it's also crucial that we start to focus on the possible outcomes of the second track -- that is, <em>which</em> Obama will be reelected.\n\nBecause (again, insert caveat here about anything can happen, etc. etc.) the candidate who at this point has the greatest ability to limit the scope of what can be achieved in an Obama second term is President Obama.\n\nWe've all seen the two Obamas in action. There's Campaign Obama, who has a phenomenal ability to inspire and challenge a broken status quo. This is the Obama who said he was going to change the way Washington works and who <a href=\"http://www.mediaite.com/online/obama-you-didn%E2%80%99t-elect-me-to-read-the-polls-and-figure-out-how-to-stay-in-office/\" target=\"_hplink\">promised</a> to not \"just read the polls and figure out how to keep myself in office.\" This Obama wasn't going to accept the conventional wisdom of what was possible; instead, he was going to reject the \"worn-out dogmas that for far too long have strangled our politics.\"\n\nBut then there's Governing Obama. This is the Obama who, instead of taking his case to the nation, let the parameters of what was considered possible (on infrastructure investment, on jobs, on foreclosures, on austerity vs. growth, on Afghanistan) be decided by... worn-out dogmas. This is the Obama who rightly insisted on the need for health care for all, but who engineered a new system that, overall, relies on and rewards the same players -- insurance companies, hospital conglomerates, drug manufacturers -- who created and profited from the mess he inherited.\n\nThis is the Obama who in a speech will dream of things that never were and ask, \"Why not?\" and then back at the White House, will look at things the way they are and ask, \"Why ruffle too many feathers?\"\n\nAs David Bromwich <a href=\"http://www.lrb.co.uk/v32/n22/david-bromwich/the-fastidious-president\" target=\"_hplink\">wrote</a> after the 2010 midterms, \"His eloquence finds its natural key not in explanations but in statements of purpose. Obama wants credit for the highest intentions even when conceding that he lacks the will to fulfill them.\"\n\nSo we have one Obama who in 2007 <a href=\"http://blogs.suntimes.com/sweet/2007/11/sweet_blog_extra_text_of_obama.html\" target=\"_hplink\">said</a>, \"I am running because of what Dr. King called 'the fierce urgency of now.' I am running because I do believe there's such a thing as being too late.\" And who in 2008 <a href=\"http://www.nytimes.com/2008/02/05/us/politics/05text-obama.html?_r=3&adxnnl=1&oref=slogin&adxnnlx=1202389567-N1AvfkRcH5Z0GrFT7AxzVQ\" target=\"_hplink\">reinforced</a> it with the assertion that \"change will not come if we wait for some other person or some other time. We are the ones we've been waiting for. We are the change that we seek.\"\n\nAnd then we have the other Obama, who seemed to be governing with the fierce urgency of... sometime later. Or much later. As he <a href=\"http://www.cbsnews.com/8301-504803_162-57341009-10391709/president-obama-the-full-60-minutes-interview/\" target=\"_hplink\">told</a> <em>60 Minutes</em> in December of last year: \"I always believed that this was a long-term project. That reversing a culture here in Washington, dominated by special interests, it was gonna take more than a year. It was gonna take more than two years. It was gonna take more than one term. Probably takes more than one president.\"\n\nSo I guess we weren't actually the ones we were waiting for. Indeed, the one we're waiting for apparently won't even be running until 2016.\n\nThere's the Obama who, in the second chapter of his second book, <a href=\"http://books.google.com/books?id=k1mVYHvsDpQC&pg=PA83&dq=If+we+aren%27t+willing+to+pay+a+price+for+our+values,+if+we+aren%27t+willing+to+make+some+sacrifices+in+order+to+realize+them,+then+we+should+ask+ourselves+whether+we+truly+believe+in+them+at+all&hl=en&sa=X&ei=qFpeT8i3Mord0QG3q-CoDw&ved=0CDYQ6AEwAQ#v=onepage&q=If%20we%20aren%27t%20willing%20to%20pay%20a%20price%20for%20our%20values%2C%20if%20we%20aren%27t%20willing%20to%20make%20some%20sacrifices%20in%20order%20to%20realize%20them%2C%20then%20we%20should%20ask%20ourselves%20whether%20we%20truly%20believe%20in%20them%20at%20all&f=false\" target=\"_hplink\">wrote</a> this: \"If we aren't willing to pay a price for our values, if we aren't willing to make some sacrifices in order to realize them, then we should ask ourselves whether we truly believe in them at all.\"\n\nBut then there's the Obama who <a href=\"http://www.huffingtonpost.com/2010/09/10/obama-news-conference-pre_1_n_712058.html\" target=\"_hplink\">gave this explanation</a> about his failure to keep his promise to close Guantanamo: \"It's not for lack of trying. It's because the politics of it are difficult.\"\n\nThere's the Obama who, in his speech accepting the Democratic presidential nomination, <a href=\"http://www.nytimes.com/2008/08/28/us/politics/28text-obama.html?pagewanted=all\" target=\"_hplink\">said</a>, \"... the greatest risk we can take is to try the same old politics with the same old players and expect a different result.\"\n\nAnd then there's the Obama who, just after winning the election, <a href=\"http://change.gov/newsroom/entry/geithner_summers_among_key_economic_team_members_announced_today/\" target=\"_hplink\">introduced</a> a critical member of his administration with these words: \"[He] helped guide us through several major international financial crises. I am glad he will be by my side, and I will rely heavily on his advice.\" The man he was introducing was Larry Summers, who, among other things, <a href=\"http://www.huffingtonpost.com/arianna-huffington/larry-summers-brilliant-m_b_178956.html\" target=\"_hplink\">was instrumental</a> in the dismantling of the Glass-Steagall Act, a move that helped bring on the current financial crisis.\n\nSo if the question about whether Obama will win continues to recede, as I hope it will, the question of which Obama will win becomes more and more paramount.\n\nThis is not to say that Obama should do what progressives -- or any other part of the electorate -- want him to do; this is quite simply holding him accountable to what he claims he wants to do.\n\nThe measure of President Obama should be the bar set for him by Candidate Obama. Unfortunately, the way the race has shaped up, the bar is set considerably lower. Take, for example, the <a href=\"http://abcnews.go.com/Politics/week-transcript-newt-gingrich-david-axelrod/story?id=15840087&page=3#.T15bjsxpFR8\" target=\"_hplink\">questions</a> David Axelrod was asked just before Super Tuesday. They included one about Newt Gingrich's call for Secretary of Energy Steven Chu to be fired and, of course, one about Rush Limbaugh's \"slut\" comments. That's a pretty low bar for the Obama campaign to jump over. And if, as the campaign moves forward, the majority of the questions President Obama and his surrogates are going to be faced with are simply responding to whatever outlandish statements are coming from the Republicans, that's clearly not going to be the most productive debate the country could be having. Given the real problems we're facing, and the fact that a presidential election should be the time to discuss and debate them, the bar should be much, much higher than that.\n\nSo instead of simply asking President Obama to respond to the most extreme or bizarre Republican statements, how about asking him instead to respond to the boldest and most ambitious statements from... Barack Obama?\n\nAt HuffPost, our plan for 2012 is to vigorously cover both tracks of the election. Which is to say that while we are exhaustively covering the race between President Obama and the Republican nominee, we're also going to be covering that second track: Obama vs. Obama. And we'll be covering it in a variety of ways: by comparing the reality of President Obama with the rhetoric of Candidate Obama; by focusing on real underlying problems in the country that are being temporarily masked by a slight improvement in the unemployment numbers; and by using satire.\n\nAs Paul Krassner, founder of <em>The Realist</em>, once <a href=\"http://findarticles.com/p/articles/mi_m1295/is_n11_v57/ai_14233515/\" target=\"_hplink\">said</a>, \"Sometimes humor is just a way of calling attention to the contradictions or the hypocrisy that's going on officially... That's the function of humor -- it can alter your reality.\" And our reality definitely needs to be altered.\n\nTo that effect, today we're launching a series of videos that will try to call attention to the contradictions of that second track of the election. This first one takes on the idea, often put forth by various members of the Obama camp, that every compromise, capitulation, and seeming surrender to the \"worn-out dogmas\" of Washington are, in fact, just a brilliant strategy that we don't yet understand. Maybe it's better if I just let Obama's chief strategist <a href=\"http://www.huffingtonpost.com/2012/03/14/obama-adviser-long-game_n_1343347.html?1331720969\" target=\"_hplink\">explain</a>...\n\n<center><script type=\"text/javascript\"> var src_url=\"http://pshared.5min.com/Scripts/PlayerSeed.js?playList=517288057&height=351&width=570&sid=577&relatedMode=1&hasCompanion=true&cbCustomID=videoCompAdDiv&autoStart=false&colorPallet=%23FFEB00&vcdBgColor=%23191919&shuffle=0&continuous=true\"; if (typeof(commercial_video) == \"object\") { src_url += \"&amp;siteSection=\"+commercial_video.site_and_category; if (commercial_video.package) { src_url += \"&amp;sponsorship=\"+commercial_video.package; } } document.write('<scr' + 'ipt type=\"text/javascript\" src=\"'+src_url+'\"></scr' + 'ipt>');</script></center>\n<div style=\"clear:both\"></div>\n\n<strong>Add your voice to the conversation on Twitter: <a href=\"http://www.twitter.com/ariannahuff\" target=\"_hplink\">twitter.com/ariannahuff</a></strong>";
	//static String content = "Nearly everyone loves <em>The Wizard of Oz</em>, and most of us have seen it enough times to quote certain lines verbatim (\"I'll get you my pretty, and your little dog too!\") or break into an a cappella version of 'We're Off to See the Wizard\" at a moment's notice. Since <em>Oz</em> is about to celebrate its 75th anniversary next year, here's a fun peek at a few details that may have escaped the attention of even the most ardent Ozophiles.\r\n\r\n<strong>1. Dorothy's Cruller.</strong> Just before singing \"Over the Rainbow,\" Dorothy takes one of the \"just fried\" crullers Aunt Em offers the farmhands. She takes a small bite, tosses a piece to Toto and from there it seems to vanish. But watch closely, she's still holding it as she begins to sing and at the beginning of the second verse, she tosses the remainder into the barnyard (hopefully Toto saw it!).\r\n\r\n<strong>2. Miss Gulch's Umbrella.</strong> As Miss Gulch pulls up to the Gale farmhouse, you can see an umbrella strapped to the front of her bicycle. This is an \"insider\" allusion to the water allergy of her Ozian alter ego, the Wicked Witch of the West. In the original L. Frank Baum book, the Witch carries an umbrella, not a broom.\r\n\r\n<strong>3. Dorothy's Dresses. </strong>Here's a question sure to stump family and friends: How many dresses is Dorothy seen wearing? The answer is two, not one. When Dorothy meets Professor Marvel, he glances at a portrait of Dorothy and Aunt Em in their Sunday best -- both are wearing wardrobe only seen for this brief moment. (Look closely: the professor never returns the photo either!)\r\n\r\n<strong>4. The Coroner's Death Certificate. </strong>When the Munchkin coroner pronounces the Wicked Witch of the East \"really most sincerely dead,\" he displays the official death certificate which is dated May 6, 1938 -- exactly 19 years after L. Frank Baum, author of the original <em>Wizard of Oz </em>book, passed away.\r\n\r\n<strong>5. Toto's Deleted Dance?</strong> When dance director Bobby Connolly was interviewed in 1939, he discussed the challenges of teaching the Munchkins how to dance in unison but he also mentioned that Toto's trainer was tone deaf, so Connolly had to give the trainer the music cue a couple beats ahead so the trainer could translate the signal to the dog. When \"Ding-Dong! The Witch is Dead\" is reprised, Toto trips down the steps of the city hall and falls in line behind the Munchkin soldiers with no further explanation -- was this the \"Toto Trot\" to which Connolly was referring?\r\n\r\n<strong>6. The Wooden Sawhorse. </strong>Another reference to the Oz book series may be the inclusion of a wooden sawhorse in the background of the Tin Man scenes. In Baum's <em>The Land of Oz </em>book, a similar sawhorse is brought magically to life and becomes a permanent resident of the Emerald City thereafter.\r\n\r\n<strong>7. The Munchkin Suicide. </strong><em>The Wizard of Oz </em>was never envisioned to play on a screen as small as a TV set, so confusion has arisen about the unusual motion in the background as Dorothy skips away with the Scarecrow and Tin Man. One silly urban legend says it is a Munchkin suicide-hanging caught on film. In actuality, the movement is that of a large stork reacting to the dancing by rising up and unfolding its wings defensively.\r\n\r\n<strong>8. Dorothy's Giggles. </strong>When filming the scene where Dorothy slaps the Cowardly Lion, Judy Garland kept flubbing each take for laughing at Bert Lahr's ridiculous blubbering. Even in the final-version scene, she is composed until the Lion reaches for his airborne tail -- and misses -- at which Judy breaks character and cracks a small smile!\r\n\r\n<strong>9. The Witch's Hourglass. </strong>Remember when time ran out and the Witch shattered her hourglass in a rage? The sand was made of pulverized red sequins (like those on the Ruby Slippers) to give it that Technicolor sparkle. And the hourglass the Witch throws had holes drilled into it so it could glide the length of a wire and hit the same mark for each take. \r\n\r\n<strong>10. Dorothy's Time Warp.</strong> It seems as though <em>The Wizard of Oz </em>all takes place in the span of one day. Indeed at the conclusion, Dorothy's family and friends are all wearing the same clothes they had on at the beginning. But in the parallel universe of Oz, time functions differently. Listen carefully and you'll hear Dorothy say she tried to get home \"for days and days.\"\r\n\r\nFor more <em>Wizard of Oz </em>fun facts and fascinating trivia, check out the new book<em> <a href=\"http://www.amazon.com/The-Wizard-Oz-Anniversary-Companion/dp/0062278010\" target=\"_hplink\">The Wizard of Oz: The Official 75th Anniversary Companion</a></em>.";
	static String content ="Another holiday season, <a href=\"http://www.people.com/people/article/0,,20761878,00.html\" target=\"_hplink\">another Kardashian family Christmas card</a> ... and 2013's is, well, over-the-top.\r\n\r\nIn the photo, shot by David LaChappelle, <a href=\"http://www.eonline.com/news/486259/the-kardashian-christmas-card-is-here-see-the-stunning-holiday-family-pic\" target=\"_hplink\">the ladies of the Kardashian-Jenner clan pose in a carnival-inspired room</a>, which features neon lights, pop art, graffiti and mannequins. (Not to mention tabloids cover the already-trashed floor.) The picture presumably represents the media circus the family is constantly in. \r\n\r\n<blockquote class=\"twitter-tweet\" lang=\"en\"><p>family Christmas card 2013 🎉 <a href=\"http://t.co/20Zg0TeCG8\">pic.twitter.com/20Zg0TeCG8</a></p>— Kendall Jenner (@KendallJenner) <a href=\"https://twitter.com/KendallJenner/statuses/407573119990120448\">December 2, 2013</a></blockquote>\r\n<script async src=\"//platform.twitter.com/widgets.js\" charset=\"utf-8\"></script>\r\n\r\n<a href=\"http://www.people.com/people/article/0,,20761878,00.html\" target=\"_hplink\">All the women wear black as they take on their individual personas</a> -- Kim rocks a revealing gown while Khloe and Kourtney pose with Mason and Penelope. Kris wears a leggy look and a head-piece as she sits next to Bruce Jenner, who's trapped in a glass tube labeled, \"cashier.\" Kendall and Kylie look glamorous as they stand atop a mountain of magazines. \r\n\r\n<iframe src=\"//instagram.com/p/hZ1QRznGma/embed/\" width=\"570\" height=\"710\" frameborder=\"0\" scrolling=\"no\" allowtransparency=\"true\"></iframe>\r\n\r\nNoticeably absent from the holiday card are most of the Kardashian men, Rob Kardashian, Scott Disick, Lamar Odom and Kanye West, as well as Kimye's daughter, North West. (Although, there is a floating baby above Khloe's head.)\r\n\r\n<img alt=\"kardashian card\" src=\"http://i.huffpost.com/gen/1492399/thumbs/o-KARDASHIAN-CARD-900.jpg?5\" />";
	
	static int MAX_WORDS=300;
	
	String entryTitle="";
	String entryBody="";
	
	public Summarize(String title,String body){	
		entryTitle = title;
		entryBody = body;	
		
		//remove the html tags.
		//entryBody = Jsoup.parse(entryBody).text();
	}
	
	private String[] contentToSentences(String content){		
		String sent = content.replace("\n", ". ");
		sent = Jsoup.parse(sent).text();
		return sent.split("\\. ");
	}
	
	private String[] contentToParagraphs(String content){
		if(content.contains("\r\n\r\n")){
			return content.split("\r\n\r\n");
		} else {
			return content.split("\n\n");
		}
		
	}
	
	/*
	 * Calculates the intersection between any two given sentences
	 */
	private double sentencesIntersection(String sent1, String sent2){
		String[] s1 = sent1.split(" ");
		String[] s2 = sent2.split(" ");
		//return zero if we get empty strings
		if(s1.length + s2.length == 0)return 0;
		
		HashSet<String> sentence1= new HashSet<String>();
		HashSet<String> sentence2= new HashSet<String>();
		for(int i=0; i<s1.length;i++){
			sentence1.add(s1[i]);
		}
		int count =0;
		for(int i=0; i<s2.length;i++){
			sentence2.add(s2[i]);
			if(sentence1.contains(s2[i])){
				count++;
			}
		}
		
		double intersect = (double) count*2/(sentence1.size()+sentence2.size());
		return intersect;
	}
	
	/*
	 * Remove all non-alphabetic chars in a sentence
	 */
	private String formatSentence(String sent){
		String formattedSent ="";
		
		formattedSent = sent.replaceAll("[^a-zA-Z]", "");
		return formattedSent;		
	}
	
	/*
	 * Rank each sentence and return a Map of the sentence and its rank
	 */
	@SuppressWarnings("null")
	private Map<String,Double> getSentenceRanks(String paragraph){
		Map<String,Double> ranks = new HashMap<String,Double>();
		
		String[] sentences = contentToSentences(paragraph);
		int num = sentences.length;
		//the intersection values of every sentence with other
		double[][] values=new double[sentences.length][sentences.length];
		//Step 1 calculate the intersection percentage
		for(int i=0; i < num;i++){
			for(int j=0;j < num;j++){
				values[i][j] = sentencesIntersection(sentences[i], sentences[j]);
			}
		}
		
		//Step 2 calculate rank based on intersection percentage
		for(int i=0; i < num;i++){
			double score = 0;			
			for(int j=0;j < num;j++){
				if(i==j)continue;
				score += values[i][j];
			}
			ranks.put(formatSentence(sentences[i]), score);
		}
				
		return ranks;
	}
	
	
	/*
	 * Get best sentence in a para
	 */
	private String getBestSentence(String para){
		String bestSentence="";
		
		//get the ranks 
		Map<String,Double> scores = getSentenceRanks(para);
		
		String[] sentences = contentToSentences(para);
		if(sentences.length<=2)return "";
		double maxValue=0;
		for(int i=0; i < sentences.length; i++){
			String stripped = formatSentence(sentences[i]);
			double scoreOfSentence = scores.get(stripped);
			if(scoreOfSentence>maxValue){
				maxValue = scoreOfSentence;
				bestSentence = sentences[i];
			}
		}
		
		return bestSentence;
	}
	
	/*
	 * Get best sentence in a para
	 */
	private String getBestSentenceNoLimits(String para){
		String bestSentence="";
		
		//get the ranks 
		Map<String,Double> scores = getSentenceRanks(para);
		
		String[] sentences = contentToSentences(para);

		double maxValue=0;
		for(int i=0; i < sentences.length; i++){
			String stripped = formatSentence(sentences[i]);
			double scoreOfSentence = scores.get(stripped);
			if(scoreOfSentence>maxValue){
				maxValue = scoreOfSentence;
				bestSentence = sentences[i];
			}
		}
		
		return bestSentence;
	}
	/*
	 * Get best sentence from whole entry if summary is too short
	 */
//	private String getBestSentence(String whole,int wordcount){
//		String bestSentence="";
//		int sentenceCount=0;
//		//get the ranks 
//		Map<String,Double> scores = getSentenceRanks(whole);
//
//		
//		String[] sentences = contentToSentences(whole);
//		if(sentences.length<=2)return "";
//		double maxValue=0;
//		
//		scores = MapUtil.sortByValue(scores);
//		
//		return bestSentence;
//		
//		
//	}
	
	public String getSummary(){
		String summary="";
		
		String[] para = contentToParagraphs(entryBody);
		
		for(int i=0; i< para.length;i++){
			summary +=getBestSentence(para[i]);
		}
		if(summary.length()==0){
			summary = getBestSentence(entryBody);
		}
		if(summary.length()==0){
			summary = getBestSentenceNoLimits(entryBody);
		}
		return summary;
	}
	
	private int wordCount(String str){
		String[] words = str.split(" ");
		return words.length;
	}
	
	public static void main(String[] args){
	
		//String lessContent = Jsoup.parse(content).text();
		
		Summarize summarize = new Summarize("The Real 2012 Race: President Obama Vs. Candidate Obama (Video)",content);
		String summary = summarize.getSummary();
		
		System.out.println(summary);
		
	}
}
