package com.dicoding.mytopchromeextentions

object HeroesData {

    // Extention Names
    private val extNames = arrayOf(
        "Web Developer",
        "Wappalyzer",
        "Window Resizer",
        "Awesome Screenshot & Screen Recorder",
        "CSSViewer",
        "Rainbow Color Picker",
        "JSONViewer",
        "Pesticide for Chrome",
        "User Agent Switcher",
        "WhatFont",
        "Page Ruler Redux",
        "Dimensions",
        "Marmoset",
        "Code Cola",
        "Google Anaytics Debugger",
        "Lighthouse",
        "Ghostery",
        "Momentum"
    )

    // Extention Details
    private  val extDetails = arrayOf(
        "Adds a toolbar button with various web developer tools.\n" +
                "\n" +
                "The Web Developer extension adds a toolbar button to the browser with various web developer tools.\n"+
                "This is the official port of the Web Developer extension for Firefox.",
        "Identify web technologies\n" +
                "\n" +
                "Wappalyzer is a utility that uncovers the technologies used on websites.\n" +
                "It detects content management systems, ecommerce platforms, web frameworks, server software, analytics tools and many more.",
        "Resize the browser window to emulate various screen resolutions.\n" +
                "\n" +
                "This extension re-sizes the browser's window in order to emulate various resolutions.\n"+
                "It is particularly useful for web designers and developers by helping them test their layouts on different browser resolutions.\n" +
                "The resolutions list is completely customizable (add/delete/re-order).\n" +
                "You can set the window's width/height, window's position, preset icon (phone, tablet, laptop, desktop) and even the option to apply the new dimensions to the entire window or just to the viewport.",
        "Full page screen capture and screen recorder 2 in 1. Share screencast video instantly.\n" +
                "\n" +
                "Capture your screen with Awesome Screenshot & Screen Recorder, a powerful tool for screen sharing, used by millions of users.\n" +
                "Save screen recordings & screenshots to awesomescreenshot.com and share your videos and images instantly with unique shareable links.",
        "A simple CSS property viewer.\n" +
                "\n" +
                "CSSViewer is a simple CSS properties viewer originally made by Nicolas Huon as a FireFox add-on (2006-2008).\n" +
                "\n" +
                "How to use :\n" +
                "To enable CSSViewer, simply click the toolbar icon and then hover any element on you want to inspect in current page.",
        "Pick color from page with eyedropper tool and get color palette from pages.\n" +
                "\n" +
                "Rainbow color picker is a must-have tool for digital designers and web developers.\n"+
                "It simply provides an eyedropper tool that helps you get RGB color from pages you visit.",
        "A simple readable JSON format.\n" +
                "\n" +
                "Format several JSON documents in one window, depends to your screen width, up to 6.\n" +
                "Now is available for Firefox, Microsoft Edge and 360 Browser(from China)",
        "This extension inserts the Pesticide CSS into the current page, outlining each element to better see placement on the page.\n" +
                "\n" +
                "In this version the banner at the bottom is off by default.\n" +
                "To turn it on hold the control key.\n" +
                "Be sure that you've clicked into the window otherwise the browser won't be able to tell that you're typing (that's just how browsers work).",
        "Simplest way to switch between user-agents in your browser!\n" +
                "\n" +
                "User Agent Switcher is simple, but powerful extension.\n"+
                "And much easier to use the Internet, regardless of which browser or operating system you prefer.\n" +
                "It adds a toolbar button that you can use to toggle between different commonly used user agent strings.",
        "The easiest way to identify fonts on web pages.\n" +
                "\n" +
                "What is the easiest way to find out the fonts used in a webpage?\n" +
                "Firebug and Webkit Inspector are easy enough to use for developers. However, for others, this should not be necessary.\n"+
                "With this extension, you could inspect web fonts by just hovering on them. It is that simple and elegant.",
        "A Web Developer or Designer ruler to get perfect pixel dimensions and positioning to measure elements on any web page.\n" +
                "\n" +
                "Page Ruler Redux is a core web developer and designer tool, that allows you to get pixel perfect measurements of web elements for website front-end development, web design or any task you may need to get perfect pixel measurements of any web elements.",
        "A tool for designers to measure screen dimensions\n" +
                "\n" +
                "This extension measures the dimensions from your mouse pointer up/down and left/right until it hits a border.\n"+
                "So if you want to measure distances between elements on a website this is perfect. It doesn't really work with images because there the colors change a lot pixel to pixel.",
        "Create gorgeous code snapshots.\n" +
                "\n" +
                "Marmoset is a Chrome App which lets you create gorgeous code snapshots within seconds.",
        "Code Cola is a chrome extension for editing online pages' css style visually and to generate css visibility.\n" +
                "\n" +
                "Code Cola allows you to view the source code of the project you’re working on, at the same time, functioning as a CSS editor so that you can easily edit and share CSS properties.",
        "Prints useful information to the JavaScript console by enabling the debug version of the Google Analytics Javascript.\n" +
                "\n" +
                "This extension loads the debug version of the Google Analytics Javascript for all sites you browse using Google Chrome.\n" +
                "It prints useful information to the Javascript console. These messages include error messages and warnings which can tell you when your analytics tracking code is set up incorrectly.  In addition, it provides a detailed breakdown of each tracking beacon sent to Google Analytics",
        "Lighthouse is an open-source, automated tool for improving the performance, quality, and correctness of your web apps. \n" +
                "\n" +
                "When auditing a page, Lighthouse runs a barrage of tests against the page, and then generates a report on how well the page did. From here you can use the failing tests as indicators on what you can do to improve your app.",
        "Ghostery is a powerful privacy extension. Block ads, stop trackers and speed up websites.\n" +
                "\n" +
                "Block ads\n" +
                "Ghostery’s built-in ad blocker removes advertisements from a webpage to eliminate clutter so you can focus on the content you want.",
        "Replace new tab page with a personal dashboard featuring to-do, weather, and inspiration.\n" +
                "\n" +
                "New Tab page that gives you a moment of calm and inspires you to be more productive.\n" +
                "Get inspired with a daily photo and quote, set a daily focus, and track your to-dos.\n"+
                "Eliminate distractions and beat procrastination with a reminder of your focus for the day on every new tab. Join over 3 million users and get inspired to create the life you want to live."
    )

    // Extention Logos
    private val extLogos = intArrayOf(
        R.drawable.web_developer,
        R.drawable.wappalyzer,
        R.drawable.window_resizer,
        R.drawable.awesome_screenshot,
        R.drawable.cssviewer,
        R.drawable.rainbow_color_picker,
        R.drawable.jsonviewer,
        R.drawable.pesticide,
        R.drawable.user_agent_switcher,
        R.drawable.whatfont,
        R.drawable.page_ruler_redux,
        R.drawable.dimensions,
        R.drawable.marmoset,
        R.drawable.code_cola,
        R.drawable.google_analytics_debugger,
        R.drawable.lighthouse,
        R.drawable.ghostery,
        R.drawable.momentum
    )

    // Extention Webstore links
    private val extLinks = arrayOf(
        "https://chrome.google.com/webstore/detail/web-developer/bfbameneiokkgbdmiekhjnmfkcnldhhm",
        "https://chrome.google.com/webstore/detail/wappalyzer/gppongmhjkpfnbhagpmjfkannfbllamg",
        "https://chrome.google.com/webstore/detail/window-resizer/kkelicaakdanhinjdeammmilcgefonfh",
        "https://chrome.google.com/webstore/detail/awesome-screenshot-screen/nlipoenfbbikpbjkfpfillcgkoblgpmj",
        "https://chrome.google.com/webstore/detail/cssviewer/ggfgijbpiheegefliciemofobhmofgce",
        "https://chrome.google.com/webstore/detail/rainbow-color-picker/mlcjgkkpemdfclhfehjpgaaagkfpnnki",
        "https://chrome.google.com/webstore/detail/jsonviewer/khbdpaabobknhhlpglenglkkhdmkfnca",
        "https://chrome.google.com/webstore/detail/pesticide-for-chrome/bblbgcheenepgnnajgfpiicnbbdmmooh",
        "https://chrome.google.com/webstore/detail/user-agent-switcher/kchfmpdcejfkipopnolndinkeoipnoia",
        "https://chrome.google.com/webstore/detail/whatfont/jabopobgcpjmedljpbcaablpmlmfcogm",
        "https://chrome.google.com/webstore/detail/page-ruler-redux/giejhjebcalaheckengmchjekofhhmal",
        "https://chrome.google.com/webstore/detail/dimensions/baocaagndhipibgklemoalmkljaimfdj",
        "https://chrome.google.com/webstore/detail/marmoset/npkfpddkpefnmkflhhligbkofhnafieb?hl=en",
        "https://chrome.google.com/webstore/detail/code-cola/lomkpheldlbkkfiifcbfifipaofnmnkn?hl=en",
        "https://chrome.google.com/webstore/detail/google-analytics-debugger/jnkmfdileelhofjcijamephohjechhna?hl=en",
        "https://chrome.google.com/webstore/detail/lighthouse/blipmdconlkpinefehnmjammfjpmpbjk",
        "https://chrome.google.com/webstore/detail/ghostery-%E2%80%93-privacy-ad-blo/mlomiejdfkolichcflejclcbmpeaniij?hl=en",
        "https://chrome.google.com/webstore/detail/momentum/laookkfknpbbblfpciffpaejjkokdgca?hl=en"
    )

    // Looping and set data based on index
    val listData: ArrayList<Hero>
        get() {
            val list = arrayListOf<Hero>()
            for (position in extNames.indices) {
                val ext = Hero()
                ext.name = extNames[position]
                ext.detail = extDetails[position]
                ext.logo = extLogos[position]
                ext.link = extLinks[position]
                list.add(ext)
            }
            return list
        }
}