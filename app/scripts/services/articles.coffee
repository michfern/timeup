angular.module('timeupApp')
  .factory 'Articles', ($resource) ->

    # articles: -> [
    #   sourceEntryId: "4373481"
    #   title: "The Kardashian Family Christmas Card 2013 Is Sort Of Bizarre"
    #   summary: "All the women wear black as they take on their individual personas -- Kim rocks a revealing gown while Khloe and Kourtney pose with Mason and Penelope"
    # ,
    #   sourceEntryId: "4351344"
    #   title: "Meet Patrick Soon-Shiong, The LA Billionaire Reinventing Your Health Care"
    #   summary: "Soon-Shiong is out to prove that it is -- and that it is, in fact, the only way forward"
    # ,
    #   sourceEntryId: "4373673"
    #   title: "The Piano Guys Will Blow You Away With 'Angels We Have Heard on High' (VIDEO)"
    #   summary: ""
    # ,
    #   sourceEntryId: "4371633"
    #   title: "'Fast And Furious' Star Tyrese Breaks Down In Tears At Paul Walker Crash Site"
    #   summary: ""
    # ,
    #   sourceEntryId: "4371266"
    #   title: "Amazon Cyber Monday Deals 2013"
    #   summary: "Cyber Monday is the time for goofing off at work and doing holiday shopping"
    # ,
    #   sourceEntryId: "4351344"
    #   title: "Meet Patrick Soon-Shiong, The LA Billionaire Reinventing Your Health Care"
    #   summary: "Soon-Shiong is out to prove that it is -- and that it is, in fact, the only way forward"
    # ,
    #   sourceEntryId: "4350772"
    #   title: "10 Things You Never Noticed About <i>The Wizard of Oz</i>"
    #   summary: ""
    # ,
    #   sourceEntryId: "4350772"
    #   title: "10 Things You Never Noticed About <i>The Wizard of Oz</i>"
    #   summary: ""
    # ,
    #   sourceEntryId: "4373673"
    #   title: "The Piano Guys Will Blow You Away With 'Angels We Have Heard on High' (VIDEO)"
    #   summary: ""
    # ,
    #   sourceEntryId: "4372573"
    #   title: "Landry Thompson, 13, Taken Into Custody After Dozing Off In Dance Instructor's Car"
    #   summary: "“She was with the people I wanted her to be with"
    # ,
    #   sourceEntryId: "4371418"
    #   title: "Gisele Bundchen Practices Yoga With Daughter Vivian And It Couldn't Be Cuter"
    #   summary: "A photo of Gisele Bundchen and her baby girl, Vivian, practicing yoga together gives adorable meaning to the phrase, \"Like mother, like daughter.\" "
    # ,
    #   sourceEntryId: "4368488"
    #   title: "Ron Burgundy Co-Anchors North Dakota Newscast For Real"
    #   summary: "Deadpanning his way through actual stories, Ferrell hosted the post-Iron Bowl broadcast alongside anchor Amber Schatz, who showed superhuman strength in not cracking up every few seconds"
    # ,
    #   sourceEntryId: "4373374"
    #   title: "'Matilda' Star Mara Wilson On Her 'Breakup' With Hollywood: 'I Was 13, Awkward And Gawky'"
    #   summary: ""
    # ,
    #   sourceEntryId: "4373635"
    #   title: "Rush Limbaugh vs. Pope Francis: Talk Show Host Attacks 'Pure Marxism' Of 'Evangelii Gaudium'"
    #   summary: ""
    # ,
    #   sourceEntryId: "4372573"
    #   title: "Landry Thompson, 13, Taken Into Custody After Dozing Off In Dance Instructor's Car"
    #   summary: "“She was with the people I wanted her to be with"
    # ,
    #   sourceEntryId: "4317046"
    #   title: "12 Unhealthy Fish You Should Avoid"
    #   summary: ""
    # ,
    #   sourceEntryId: "4372274"
    #   title: "Raven-Symone Posts Sultry Instagram Pic, Gives Girlfriend AzMarie Livingston A Shout-Out"
    #   summary: "Raven-Symone posted a sultry Instagram photo and gave a shout-out to her rumored girlfriend in the process"
    # ,
    #   sourceEntryId: "4369685"
    #   title: "Amazon Reveals It Wants To Deploy Delivery Drones. No Joke."
    #   summary: "Prime Air was unveiled to Rose and \"60 Minutes\" as a surprise, the secret project being part of Amazon's busy R&D department"
    # ,
    #   sourceEntryId: "4373472"
    #   title: "Americans Want Congress Members To Pee In Cups To Prove They're Not On Drugs"
    #   summary: "Sixty-two percent said they \"strongly\" favor drug testing for congressional lawmakers, compared to only 51 percent who said the same of welfare recipients"
    # ,
    #   sourceEntryId: "4317046"
    #   title: "12 Unhealthy Fish You Should Avoid"
    #   summary: ""
    # ,
    #   sourceEntryId: "4371266"
    #   title: "Amazon Cyber Monday Deals 2013"
    #   summary: "Cyber Monday is the time for goofing off at work and doing holiday shopping"
    # ,
    #   sourceEntryId: "4372892"
    #   title: "Kim Kardashian's Rules On How To Take The Perfect Selfie"
    #   summary: ""
    # ,
    #   sourceEntryId: "4374365"
    #   title: "Loading Koch Industries Website Too Many Times In 1 Minute Just Cost This Truck Driver $183,000"
    #   summary: ""
    # ,
    #   sourceEntryId: "4317046"
    #   title: "12 Unhealthy Fish You Should Avoid"
    #   summary: ""
    # ,
    #   sourceEntryId: "4377581"
    #   title: "Stars Without Makeup: Kourtney Kardashian Is Adorable, Right?"
    #   summary: ""
    # ,
    #   sourceEntryId: "4371266"
    #   title: "Amazon Cyber Monday Deals 2013"
    #   summary: "Cyber Monday is the time for goofing off at work and doing holiday shopping"
    # ,
    #   sourceEntryId: "4372431"
    #   title: "Paul Walker Crash Photos Show Severity Of Accident"
    #   summary: ""
    # ,
    #   sourceEntryId: "4368025"
    #   title: "Kim Kardashian Defends Her Parenting Skills, Slams Critics On Twitter"
    #   summary: ""
    # ,
    #   sourceEntryId: "4377581"
    #   title: "Stars Without Makeup: Kourtney Kardashian Is Adorable, Right?"
    #   summary: ""
    # ,
    #   sourceEntryId: "4373673"
    #   title: "The Piano Guys Will Blow You Away With 'Angels We Have Heard on High' (VIDEO)"
    #   summary: ""
    # ,
    #   sourceEntryId: "4369685"
    #   title: "Amazon Reveals It Wants To Deploy Delivery Drones. No Joke."
    #   summary: "Prime Air was unveiled to Rose and \"60 Minutes\" as a surprise, the secret project being part of Amazon's busy R&D department"
    # ,
    #   sourceEntryId: "4373481"
    #   title: "The Kardashian Family Christmas Card 2013 Is Sort Of Bizarre"
    #   summary: "All the women wear black as they take on their individual personas -- Kim rocks a revealing gown while Khloe and Kourtney pose with Mason and Penelope"
    # ,
    #   sourceEntryId: "4371546"
    #   title: "The Best Cyber Monday Deals Of 2013"
    #   summary: ""
    # ,
    #   sourceEntryId: "4372196"
    #   title: "20 Disgusting Homophobic Tweets In Response To Tom Daley Coming Out"
    #   summary: ""
    # ,
    #   sourceEntryId: "4350772"
    #   title: "10 Things You Never Noticed About <i>The Wizard of Oz</i>"
    #   summary: ""
    # ,
    #   sourceEntryId: "4371266"
    #   title: "Amazon Cyber Monday Deals 2013"
    #   summary: "Cyber Monday is the time for goofing off at work and doing holiday shopping"
    # ,
    #   sourceEntryId: "4372196"
    #   title: "20 Disgusting Homophobic Tweets In Response To Tom Daley Coming Out"
    #   summary: ""
    # ,
    #   sourceEntryId: "4373374"
    #   title: "'Matilda' Star Mara Wilson On Her 'Breakup' With Hollywood: 'I Was 13, Awkward And Gawky'"
    #   summary: ""
    # ,
    #   sourceEntryId: "4366214"
    #   title: "Paul Walker Dead: 'Fast And The Furious' Actor Dies In Car Crash"
    #   summary: ""
    # ,
    #   sourceEntryId: "4373481"
    #   title: "The Kardashian Family Christmas Card 2013 Is Sort Of Bizarre"
    #   summary: "All the women wear black as they take on their individual personas -- Kim rocks a revealing gown while Khloe and Kourtney pose with Mason and Penelope"
    # ,
    #   sourceEntryId: "4373481"
    #   title: "The Kardashian Family Christmas Card 2013 Is Sort Of Bizarre"
    #   summary: "All the women wear black as they take on their individual personas -- Kim rocks a revealing gown while Khloe and Kourtney pose with Mason and Penelope"
    # ,
    #   sourceEntryId: "4373884"
    #   title: "Is Pope Francis Leaving Vatican At Night To Minister To Homeless?"
    #   summary: "A recent interview with Archbishop Konrad Krajewski, the \"Almoner of His Holiness,\" raised speculation that the Pope joins him on his nightly trips into Rome to give alms to the poor, and it turns out that the rumors are probably true"
    # ,
    #   sourceEntryId: "4373673"
    #   title: "The Piano Guys Will Blow You Away With 'Angels We Have Heard on High' (VIDEO)"
    #   summary: ""
    # ,
    #   sourceEntryId: "4372431"
    #   title: "Paul Walker Crash Photos Show Severity Of Accident"
    #   summary: ""
    # ,
    #   sourceEntryId: "4372274"
    #   title: "Raven-Symone Posts Sultry Instagram Pic, Gives Girlfriend AzMarie Livingston A Shout-Out"
    #   summary: "Raven-Symone posted a sultry Instagram photo and gave a shout-out to her rumored girlfriend in the process"
    # ,
    #   sourceEntryId: "4371546"
    #   title: "The Best Cyber Monday Deals Of 2013"
    #   summary: ""
    # ,
    #   sourceEntryId: "4372892"
    #   title: "Kim Kardashian's Rules On How To Take The Perfect Selfie"
    #   summary: ""
    # ,
    #   title: "Test Title"
    #   summary: "Test Summary"
    # ,
    #   sourceEntryId: "4374365"
    #   title: "Loading Koch Industries Website Too Many Times In 1 Minute Just Cost This Truck Driver $183,000"
    #   summary: ""
    # ,
    #   sourceEntryId: "4369662"
    #   title: "Kyle Kinane vs. Pace Salsa Was The Other Best Thing On Twitter This Weekend (UPDATE)"
    #   summary: ""
    # ,
    #   sourceEntryId: "4368488"
    #   title: "Ron Burgundy Co-Anchors North Dakota Newscast For Real"
    #   summary: "Deadpanning his way through actual stories, Ferrell hosted the post-Iron Bowl broadcast alongside anchor Amber Schatz, who showed superhuman strength in not cracking up every few seconds"
    # ,
    #   sourceEntryId: "4373884"
    #   title: "Is Pope Francis Leaving Vatican At Night To Minister To Homeless?"
    #   summary: "A recent interview with Archbishop Konrad Krajewski, the \"Almoner of His Holiness,\" raised speculation that the Pope joins him on his nightly trips into Rome to give alms to the poor, and it turns out that the rumors are probably true"
    # ,
    #   sourceEntryId: "4371633"
    #   title: "'Fast And Furious' Star Tyrese Breaks Down In Tears At Paul Walker Crash Site"
    #   summary: ""
    # ,
    #   sourceEntryId: "4371418"
    #   title: "Gisele Bundchen Practices Yoga With Daughter Vivian And It Couldn't Be Cuter"
    #   summary: "A photo of Gisele Bundchen and her baby girl, Vivian, practicing yoga together gives adorable meaning to the phrase, \"Like mother, like daughter.\" "
    # ,
    #   sourceEntryId: "4371546"
    #   title: "The Best Cyber Monday Deals Of 2013"
    #   summary: ""
    # ,
    #   sourceEntryId: "4350772"
    #   title: "10 Things You Never Noticed About <i>The Wizard of Oz</i>"
    #   summary: ""
    # ,
    #   sourceEntryId: "4366214"
    #   title: "Paul Walker Dead: 'Fast And The Furious' Actor Dies In Car Crash"
    #   summary: ""
    # ,
    #   sourceEntryId: "4373472"
    #   title: "Americans Want Congress Members To Pee In Cups To Prove They're Not On Drugs"
    #   summary: "Sixty-two percent said they \"strongly\" favor drug testing for congressional lawmakers, compared to only 51 percent who said the same of welfare recipients"
    # ,
    #   sourceEntryId: "4373884"
    #   title: "Is Pope Francis Leaving Vatican At Night To Minister To Homeless?"
    #   summary: "A recent interview with Archbishop Konrad Krajewski, the \"Almoner of His Holiness,\" raised speculation that the Pope joins him on his nightly trips into Rome to give alms to the poor, and it turns out that the rumors are probably true"
    # ,
    #   sourceEntryId: "4372431"
    #   title: "Paul Walker Crash Photos Show Severity Of Accident"
    #   summary: ""
    # ,
    #   sourceEntryId: "4377581"
    #   title: "Stars Without Makeup: Kourtney Kardashian Is Adorable, Right?"
    #   summary: ""
    # ,
    #   sourceEntryId: "4372573"
    #   title: "Landry Thompson, 13, Taken Into Custody After Dozing Off In Dance Instructor's Car"
    #   summary: "“She was with the people I wanted her to be with"
    # ,
    #   sourceEntryId: "4372573"
    #   title: "Landry Thompson, 13, Taken Into Custody After Dozing Off In Dance Instructor's Car"
    #   summary: "“She was with the people I wanted her to be with"
    # ,
    #   sourceEntryId: "4317046"
    #   title: "12 Unhealthy Fish You Should Avoid"
    #   summary: ""
    # ,
    #   sourceEntryId: "4371633"
    #   title: "'Fast And Furious' Star Tyrese Breaks Down In Tears At Paul Walker Crash Site"
    #   summary: ""
    # ,
    #   sourceEntryId: "4369685"
    #   title: "Amazon Reveals It Wants To Deploy Delivery Drones. No Joke."
    #   summary: "Prime Air was unveiled to Rose and \"60 Minutes\" as a surprise, the secret project being part of Amazon's busy R&D department"
    # ,
    #   sourceEntryId: "4369662"
    #   title: "Kyle Kinane vs. Pace Salsa Was The Other Best Thing On Twitter This Weekend (UPDATE)"
    #   summary: ""
    # ,
    #   sourceEntryId: "4372196"
    #   title: "20 Disgusting Homophobic Tweets In Response To Tom Daley Coming Out"
    #   summary: ""
    # ,
    #   sourceEntryId: "4373635"
    #   title: "Rush Limbaugh vs. Pope Francis: Talk Show Host Attacks 'Pure Marxism' Of 'Evangelii Gaudium'"
    #   summary: ""
    # ,
    #   sourceEntryId: "4372468"
    #   title: "Westboro Baptists Will Picket Paul Walker's Funeral"
    #   summary: "WBC regularly pickets the funeral of soldiers, and they now seem to be targeting celebrities too"
    # ,
    #   sourceEntryId: "4377581"
    #   title: "Stars Without Makeup: Kourtney Kardashian Is Adorable, Right?"
    #   summary: ""
    # ,
    #   sourceEntryId: "4373884"
    #   title: "Is Pope Francis Leaving Vatican At Night To Minister To Homeless?"
    #   summary: "A recent interview with Archbishop Konrad Krajewski, the \"Almoner of His Holiness,\" raised speculation that the Pope joins him on his nightly trips into Rome to give alms to the poor, and it turns out that the rumors are probably true"
    # ,
    #   sourceEntryId: "4374365"
    #   title: "Loading Koch Industries Website Too Many Times In 1 Minute Just Cost This Truck Driver $183,000"
    #   summary: ""
    # ,
    #   sourceEntryId: "4372274"
    #   title: "Raven-Symone Posts Sultry Instagram Pic, Gives Girlfriend AzMarie Livingston A Shout-Out"
    #   summary: "Raven-Symone posted a sultry Instagram photo and gave a shout-out to her rumored girlfriend in the process"
    # ,
    #   sourceEntryId: "4371633"
    #   title: "'Fast And Furious' Star Tyrese Breaks Down In Tears At Paul Walker Crash Site"
    #   summary: ""
    # ,
    #   sourceEntryId: "4372468"
    #   title: "Westboro Baptists Will Picket Paul Walker's Funeral"
    #   summary: "WBC regularly pickets the funeral of soldiers, and they now seem to be targeting celebrities too"
    # ,
    #   sourceEntryId: "4373374"
    #   title: "'Matilda' Star Mara Wilson On Her 'Breakup' With Hollywood: 'I Was 13, Awkward And Gawky'"
    #   summary: ""
    # ,
    #   sourceEntryId: "4373374"
    #   title: "'Matilda' Star Mara Wilson On Her 'Breakup' With Hollywood: 'I Was 13, Awkward And Gawky'"
    #   summary: ""
    # ,
    #   sourceEntryId: "4373472"
    #   title: "Americans Want Congress Members To Pee In Cups To Prove They're Not On Drugs"
    #   summary: "Sixty-two percent said they \"strongly\" favor drug testing for congressional lawmakers, compared to only 51 percent who said the same of welfare recipients"
    # ,
    #   sourceEntryId: "4372468"
    #   title: "Westboro Baptists Will Picket Paul Walker's Funeral"
    #   summary: "WBC regularly pickets the funeral of soldiers, and they now seem to be targeting celebrities too"
    # ,
    #   sourceEntryId: "4369685"
    #   title: "Amazon Reveals It Wants To Deploy Delivery Drones. No Joke."
    #   summary: "Prime Air was unveiled to Rose and \"60 Minutes\" as a surprise, the secret project being part of Amazon's busy R&D department"
    # ,
    #   sourceEntryId: "4369662"
    #   title: "Kyle Kinane vs. Pace Salsa Was The Other Best Thing On Twitter This Weekend (UPDATE)"
    #   summary: ""
    # ,
    #   sourceEntryId: "4371418"
    #   title: "Gisele Bundchen Practices Yoga With Daughter Vivian And It Couldn't Be Cuter"
    #   summary: "A photo of Gisele Bundchen and her baby girl, Vivian, practicing yoga together gives adorable meaning to the phrase, \"Like mother, like daughter.\" "
    # ,
    #   sourceEntryId: "4373635"
    #   title: "Rush Limbaugh vs. Pope Francis: Talk Show Host Attacks 'Pure Marxism' Of 'Evangelii Gaudium'"
    #   summary: ""
    # ,
    #   sourceEntryId: "4373635"
    #   title: "Rush Limbaugh vs. Pope Francis: Talk Show Host Attacks 'Pure Marxism' Of 'Evangelii Gaudium'"
    #   summary: ""
    # ,
    #   sourceEntryId: "4373472"
    #   title: "Americans Want Congress Members To Pee In Cups To Prove They're Not On Drugs"
    #   summary: "Sixty-two percent said they \"strongly\" favor drug testing for congressional lawmakers, compared to only 51 percent who said the same of welfare recipients"
    # ,
    #   sourceEntryId: "4351344"
    #   title: "Meet Patrick Soon-Shiong, The LA Billionaire Reinventing Your Health Care"
    #   summary: "Soon-Shiong is out to prove that it is -- and that it is, in fact, the only way forward"
    # ,
    #   sourceEntryId: "4371418"
    #   title: "Gisele Bundchen Practices Yoga With Daughter Vivian And It Couldn't Be Cuter"
    #   summary: "A photo of Gisele Bundchen and her baby girl, Vivian, practicing yoga together gives adorable meaning to the phrase, \"Like mother, like daughter.\" "
    # ,
    #   sourceEntryId: "4372892"
    #   title: "Kim Kardashian's Rules On How To Take The Perfect Selfie"
    #   summary: ""
    # ,
    #   sourceEntryId: "4371546"
    #   title: "The Best Cyber Monday Deals Of 2013"
    #   summary: ""
    # ,
    #   sourceEntryId: "4366214"
    #   title: "Paul Walker Dead: 'Fast And The Furious' Actor Dies In Car Crash"
    #   summary: ""
    # ,
    #   sourceEntryId: "4372431"
    #   title: "Paul Walker Crash Photos Show Severity Of Accident"
    #   summary: ""
    # ,
    #   sourceEntryId: "4372892"
    #   title: "Kim Kardashian's Rules On How To Take The Perfect Selfie"
    #   summary: ""
    # ,
    #   sourceEntryId: "4372468"
    #   title: "Westboro Baptists Will Picket Paul Walker's Funeral"
    #   summary: "WBC regularly pickets the funeral of soldiers, and they now seem to be targeting celebrities too"
    # ,
    #   sourceEntryId: "4372196"
    #   title: "20 Disgusting Homophobic Tweets In Response To Tom Daley Coming Out"
    #   summary: ""
    # ,
    #   sourceEntryId: "4368025"
    #   title: "Kim Kardashian Defends Her Parenting Skills, Slams Critics On Twitter"
    #   summary: ""
    # ,
    #   sourceEntryId: "4369662"
    #   title: "Kyle Kinane vs. Pace Salsa Was The Other Best Thing On Twitter This Weekend (UPDATE)"
    #   summary: ""
    # ,
    #   sourceEntryId: "4372274"
    #   title: "Raven-Symone Posts Sultry Instagram Pic, Gives Girlfriend AzMarie Livingston A Shout-Out"
    #   summary: "Raven-Symone posted a sultry Instagram photo and gave a shout-out to her rumored girlfriend in the process"
    # ,
    #   sourceEntryId: "4366214"
    #   title: "Paul Walker Dead: 'Fast And The Furious' Actor Dies In Car Crash"
    #   summary: ""
    # ,
    #   sourceEntryId: "4374365"
    #   title: "Loading Koch Industries Website Too Many Times In 1 Minute Just Cost This Truck Driver $183,000"
    #   summary: ""
    # ,
    #   sourceEntryId: "4351344"
    #   title: "Meet Patrick Soon-Shiong, The LA Billionaire Reinventing Your Health Care"
    #   summary: "Soon-Shiong is out to prove that it is -- and that it is, in fact, the only way forward"
    # ]

    Articles = $resource "/entries", {},
      get:
        method: 'GET'
        isArray: true

    Articles
