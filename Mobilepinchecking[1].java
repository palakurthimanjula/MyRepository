{"payload":{"allShortcutsEnabled":false,"fileTree":{"":{"items":[{"name":"ASSIGNMENTPROGRAMSONPATTERNS (2).zip","path":"ASSIGNMENTPROGRAMSONPATTERNS (2).zip","contentType":"file"},{"name":"CollegeManagementRelationMapping.zip","path":"CollegeManagementRelationMapping.zip","contentType":"file"},{"name":"ElevatorProgram.java","path":"ElevatorProgram.java","contentType":"file"},{"name":"EmployeeDepartmentOneToManyBidirectional.zip","path":"EmployeeDepartmentOneToManyBidirectional.zip","contentType":"file"},{"name":"Mobilepinchecking.java","path":"Mobilepinchecking.java","contentType":"file"},{"name":"MovieManagementSystem_WithException.zip_expanded.zip","path":"MovieManagementSystem_WithException.zip_expanded.zip","contentType":"file"},{"name":"Moviemgt.zip","path":"Moviemgt.zip","contentType":"file"},{"name":"MoviemgtWithCollection.zip","path":"MoviemgtWithCollection.zip","contentType":"file"},{"name":"ShopOnline.java","path":"ShopOnline.java","contentType":"file"},{"name":"SingletonMain.java","path":"SingletonMain.java","contentType":"file"},{"name":"StudentData1.java","path":"StudentData1.java","contentType":"file"},{"name":"hibernate-onetoone-mapping1.zip","path":"hibernate-onetoone-mapping1.zip","contentType":"file"}],"totalCount":12}},"fileTreeProcessingTime":10.292763,"foldersToFetch":[],"reducedMotionEnabled":null,"repo":{"id":638830122,"defaultBranch":"main","name":"JAVA-","ownerLogin":"palakurthimanjula","currentUserCanPush":false,"isFork":false,"isEmpty":false,"createdAt":"2023-05-10T07:42:53.000Z","ownerAvatar":"https://avatars.githubusercontent.com/u/131944670?v=4","public":true,"private":false,"isOrgOwned":false},"refInfo":{"name":"main","listCacheKey":"v0:1686667643.528646","canEdit":false,"refType":"branch","currentOid":"ed461d5a9fa734f1f6156a959eb44ecb73a1839b"},"path":"Mobilepinchecking.java","currentUser":null,"blob":{"rawLines":["package com.edu;\r","import java.util.*;\r","\r","public class Mobilepinchecking {\r","    public static void main(String[] args) {\r","        Scanner sc = new Scanner(System.in);\r","        System.out.println(\"Enter the total number of PIN numbers\");\r","        int n = sc.nextInt();\r","        \r","        if(n <= 0) {\r","            System.out.println(n + \" is an invalid number\");\r","            return;\r","        }\r","        \r","        System.out.println(\"Enter the PIN numbers\");\r","        List<String> validPins = new ArrayList<>();\r","        \r","        for(int i = 0; i < n; i++) {\r","            String pin = sc.next();\r","            \r","            if(pin.length() != 4 || !isNumeric(pin)) {\r","                System.out.println(pin + \" is an invalid PIN number\");\r","                continue;\r","            }\r","            \r","            int first = pin.charAt(0) - '0';\r","            int second = pin.charAt(1) - '0';\r","            int third = pin.charAt(2) - '0';\r","            int fourth = pin.charAt(3) - '0';\r","            \r","            if(first % 2 != 1 || second % 2 != 0 || !isPrime(third) || isPrime(fourth)) {\r","                continue;\r","            }\r","            \r","            validPins.add(pin);\r","        }\r","        \r","        if(validPins.size() == 0) {\r","            System.out.println(\"All these \" + n + \" numbers are not a valid PIN number\");\r","        } else {\r","            System.out.println(\"Valid PIN numbers are\");\r","            for(String pin : validPins) {\r","                System.out.println(pin);\r","            }\r","        }\r","    }\r","    \r","    private static boolean isNumeric(String str) {\r","        for(char c : str.toCharArray()) {\r","            if(!Character.isDigit(c)) {\r","                return false;\r","            }\r","        }\r","        return true;\r","    }\r","    \r","    private static boolean isPrime(int n) {\r","        if(n <= 1) {\r","            return false;\r","        }\r","        for(int i = 2; i <= Math.sqrt(n); i++) {\r","            if(n % i == 0) {\r","                return false;\r","            }\r","        }\r","        return true;\r","    }\r","}\r","\r","\r","\r","\r","\r"],"stylingDirectives":[[{"start":0,"end":7,"cssClass":"pl-k"},{"start":8,"end":11,"cssClass":"pl-s1"},{"start":12,"end":15,"cssClass":"pl-s1"}],[{"start":0,"end":6,"cssClass":"pl-k"},{"start":7,"end":11,"cssClass":"pl-s1"},{"start":12,"end":16,"cssClass":"pl-s1"}],[],[{"start":0,"end":6,"cssClass":"pl-k"},{"start":7,"end":12,"cssClass":"pl-k"},{"start":13,"end":30,"cssClass":"pl-smi"}],[{"start":4,"end":10,"cssClass":"pl-k"},{"start":11,"end":17,"cssClass":"pl-k"},{"start":18,"end":22,"cssClass":"pl-smi"},{"start":23,"end":27,"cssClass":"pl-en"},{"start":28,"end":34,"cssClass":"pl-smi"},{"start":37,"end":41,"cssClass":"pl-s1"}],[{"start":8,"end":15,"cssClass":"pl-smi"},{"start":16,"end":18,"cssClass":"pl-s1"},{"start":21,"end":24,"cssClass":"pl-k"},{"start":25,"end":32,"cssClass":"pl-smi"},{"start":33,"end":39,"cssClass":"pl-smi"},{"start":40,"end":42,"cssClass":"pl-s1"}],[{"start":8,"end":14,"cssClass":"pl-smi"},{"start":15,"end":18,"cssClass":"pl-s1"},{"start":19,"end":26,"cssClass":"pl-en"},{"start":27,"end":66,"cssClass":"pl-s"}],[{"start":8,"end":11,"cssClass":"pl-smi"},{"start":12,"end":13,"cssClass":"pl-s1"},{"start":16,"end":18,"cssClass":"pl-s1"},{"start":19,"end":26,"cssClass":"pl-en"}],[],[{"start":8,"end":10,"cssClass":"pl-k"},{"start":11,"end":12,"cssClass":"pl-s1"},{"start":16,"end":17,"cssClass":"pl-c1"}],[{"start":12,"end":18,"cssClass":"pl-smi"},{"start":19,"end":22,"cssClass":"pl-s1"},{"start":23,"end":30,"cssClass":"pl-en"},{"start":31,"end":32,"cssClass":"pl-s1"},{"start":35,"end":58,"cssClass":"pl-s"}],[{"start":12,"end":18,"cssClass":"pl-k"}],[],[],[{"start":8,"end":14,"cssClass":"pl-smi"},{"start":15,"end":18,"cssClass":"pl-s1"},{"start":19,"end":26,"cssClass":"pl-en"},{"start":27,"end":50,"cssClass":"pl-s"}],[{"start":8,"end":12,"cssClass":"pl-smi"},{"start":13,"end":19,"cssClass":"pl-smi"},{"start":21,"end":30,"cssClass":"pl-s1"},{"start":33,"end":36,"cssClass":"pl-k"},{"start":37,"end":46,"cssClass":"pl-smi"}],[],[{"start":8,"end":11,"cssClass":"pl-k"},{"start":12,"end":15,"cssClass":"pl-smi"},{"start":16,"end":17,"cssClass":"pl-s1"},{"start":20,"end":21,"cssClass":"pl-c1"},{"start":23,"end":24,"cssClass":"pl-s1"},{"start":27,"end":28,"cssClass":"pl-s1"},{"start":30,"end":31,"cssClass":"pl-s1"}],[{"start":12,"end":18,"cssClass":"pl-smi"},{"start":19,"end":22,"cssClass":"pl-s1"},{"start":25,"end":27,"cssClass":"pl-s1"},{"start":28,"end":32,"cssClass":"pl-en"}],[],[{"start":12,"end":14,"cssClass":"pl-k"},{"start":15,"end":18,"cssClass":"pl-s1"},{"start":19,"end":25,"cssClass":"pl-en"},{"start":31,"end":32,"cssClass":"pl-c1"},{"start":37,"end":46,"cssClass":"pl-en"},{"start":47,"end":50,"cssClass":"pl-s1"}],[{"start":16,"end":22,"cssClass":"pl-smi"},{"start":23,"end":26,"cssClass":"pl-s1"},{"start":27,"end":34,"cssClass":"pl-en"},{"start":35,"end":38,"cssClass":"pl-s1"},{"start":41,"end":68,"cssClass":"pl-s"}],[{"start":16,"end":24,"cssClass":"pl-k"}],[],[],[{"start":12,"end":15,"cssClass":"pl-smi"},{"start":16,"end":21,"cssClass":"pl-s1"},{"start":24,"end":27,"cssClass":"pl-s1"},{"start":28,"end":34,"cssClass":"pl-en"},{"start":35,"end":36,"cssClass":"pl-c1"},{"start":40,"end":43,"cssClass":"pl-s"}],[{"start":12,"end":15,"cssClass":"pl-smi"},{"start":16,"end":22,"cssClass":"pl-s1"},{"start":25,"end":28,"cssClass":"pl-s1"},{"start":29,"end":35,"cssClass":"pl-en"},{"start":36,"end":37,"cssClass":"pl-c1"},{"start":41,"end":44,"cssClass":"pl-s"}],[{"start":12,"end":15,"cssClass":"pl-smi"},{"start":16,"end":21,"cssClass":"pl-s1"},{"start":24,"end":27,"cssClass":"pl-s1"},{"start":28,"end":34,"cssClass":"pl-en"},{"start":35,"end":36,"cssClass":"pl-c1"},{"start":40,"end":43,"cssClass":"pl-s"}],[{"start":12,"end":15,"cssClass":"pl-smi"},{"start":16,"end":22,"cssClass":"pl-s1"},{"start":25,"end":28,"cssClass":"pl-s1"},{"start":29,"end":35,"cssClass":"pl-en"},{"start":36,"end":37,"cssClass":"pl-c1"},{"start":41,"end":44,"cssClass":"pl-s"}],[],[{"start":12,"end":14,"cssClass":"pl-k"},{"start":15,"end":20,"cssClass":"pl-s1"},{"start":23,"end":24,"cssClass":"pl-c1"},{"start":28,"end":29,"cssClass":"pl-c1"},{"start":33,"end":39,"cssClass":"pl-s1"},{"start":42,"end":43,"cssClass":"pl-c1"},{"start":47,"end":48,"cssClass":"pl-c1"},{"start":53,"end":60,"cssClass":"pl-en"},{"start":61,"end":66,"cssClass":"pl-s1"},{"start":71,"end":78,"cssClass":"pl-en"},{"start":79,"end":85,"cssClass":"pl-s1"}],[{"start":16,"end":24,"cssClass":"pl-k"}],[],[],[{"start":12,"end":21,"cssClass":"pl-s1"},{"start":22,"end":25,"cssClass":"pl-en"},{"start":26,"end":29,"cssClass":"pl-s1"}],[],[],[{"start":8,"end":10,"cssClass":"pl-k"},{"start":11,"end":20,"cssClass":"pl-s1"},{"start":21,"end":25,"cssClass":"pl-en"},{"start":31,"end":32,"cssClass":"pl-c1"}],[{"start":12,"end":18,"cssClass":"pl-smi"},{"start":19,"end":22,"cssClass":"pl-s1"},{"start":23,"end":30,"cssClass":"pl-en"},{"start":31,"end":43,"cssClass":"pl-s"},{"start":46,"end":47,"cssClass":"pl-s1"},{"start":50,"end":87,"cssClass":"pl-s"}],[{"start":10,"end":14,"cssClass":"pl-k"}],[{"start":12,"end":18,"cssClass":"pl-smi"},{"start":19,"end":22,"cssClass":"pl-s1"},{"start":23,"end":30,"cssClass":"pl-en"},{"start":31,"end":54,"cssClass":"pl-s"}],[{"start":12,"end":15,"cssClass":"pl-k"},{"start":16,"end":22,"cssClass":"pl-smi"},{"start":23,"end":26,"cssClass":"pl-s1"},{"start":29,"end":38,"cssClass":"pl-s1"}],[{"start":16,"end":22,"cssClass":"pl-smi"},{"start":23,"end":26,"cssClass":"pl-s1"},{"start":27,"end":34,"cssClass":"pl-en"},{"start":35,"end":38,"cssClass":"pl-s1"}],[],[],[],[],[{"start":4,"end":11,"cssClass":"pl-k"},{"start":12,"end":18,"cssClass":"pl-k"},{"start":19,"end":26,"cssClass":"pl-smi"},{"start":27,"end":36,"cssClass":"pl-en"},{"start":37,"end":43,"cssClass":"pl-smi"},{"start":44,"end":47,"cssClass":"pl-s1"}],[{"start":8,"end":11,"cssClass":"pl-k"},{"start":12,"end":16,"cssClass":"pl-smi"},{"start":17,"end":18,"cssClass":"pl-s1"},{"start":21,"end":24,"cssClass":"pl-s1"},{"start":25,"end":36,"cssClass":"pl-en"}],[{"start":12,"end":14,"cssClass":"pl-k"},{"start":16,"end":25,"cssClass":"pl-smi"},{"start":26,"end":33,"cssClass":"pl-en"},{"start":34,"end":35,"cssClass":"pl-s1"}],[{"start":16,"end":22,"cssClass":"pl-k"},{"start":23,"end":28,"cssClass":"pl-c1"}],[],[],[{"start":8,"end":14,"cssClass":"pl-k"},{"start":15,"end":19,"cssClass":"pl-c1"}],[],[],[{"start":4,"end":11,"cssClass":"pl-k"},{"start":12,"end":18,"cssClass":"pl-k"},{"start":19,"end":26,"cssClass":"pl-smi"},{"start":27,"end":34,"cssClass":"pl-en"},{"start":35,"end":38,"cssClass":"pl-smi"},{"start":39,"end":40,"cssClass":"pl-s1"}],[{"start":8,"end":10,"cssClass":"pl-k"},{"start":11,"end":12,"cssClass":"pl-s1"},{"start":16,"end":17,"cssClass":"pl-c1"}],[{"start":12,"end":18,"cssClass":"pl-k"},{"start":19,"end":24,"cssClass":"pl-c1"}],[],[{"start":8,"end":11,"cssClass":"pl-k"},{"start":12,"end":15,"cssClass":"pl-smi"},{"start":16,"end":17,"cssClass":"pl-s1"},{"start":20,"end":21,"cssClass":"pl-c1"},{"start":23,"end":24,"cssClass":"pl-s1"},{"start":28,"end":32,"cssClass":"pl-smi"},{"start":33,"end":37,"cssClass":"pl-en"},{"start":38,"end":39,"cssClass":"pl-s1"},{"start":42,"end":43,"cssClass":"pl-s1"}],[{"start":12,"end":14,"cssClass":"pl-k"},{"start":15,"end":16,"cssClass":"pl-s1"},{"start":19,"end":20,"cssClass":"pl-s1"},{"start":24,"end":25,"cssClass":"pl-c1"}],[{"start":16,"end":22,"cssClass":"pl-k"},{"start":23,"end":28,"cssClass":"pl-c1"}],[],[],[{"start":8,"end":14,"cssClass":"pl-k"},{"start":15,"end":19,"cssClass":"pl-c1"}],[],[],[],[],[],[],[]],"csv":null,"csvError":null,"dependabotInfo":{"showConfigurationBanner":false,"configFilePath":null,"networkDependabotPath":"/palakurthimanjula/JAVA-/network/updates","dismissConfigurationNoticePath":"/settings/dismiss-notice/dependabot_configuration_notice","configurationNoticeDismissed":null,"repoAlertsPath":"/palakurthimanjula/JAVA-/security/dependabot","repoSecurityAndAnalysisPath":"/palakurthimanjula/JAVA-/settings/security_analysis","repoOwnerIsOrg":false,"currentUserCanAdminRepo":false},"displayName":"Mobilepinchecking.java","displayUrl":"https://github.com/palakurthimanjula/JAVA-/blob/main/Mobilepinchecking.java?raw=true","headerInfo":{"blobSize":"1.99 KB","deleteInfo":{"deletePath":null,"deleteTooltip":"You must be signed in to make or propose changes"},"editInfo":{"editTooltip":"You must be signed in to make or propose changes"},"ghDesktopPath":"https://desktop.github.com","gitLfsPath":null,"onBranch":true,"shortPath":"8f9a9f6","siteNavLoginPath":"/login?return_to=https%3A%2F%2Fgithub.com%2Fpalakurthimanjula%2FJAVA-%2Fblob%2Fmain%2FMobilepinchecking.java","isCSV":false,"isRichtext":false,"toc":null,"lineInfo":{"truncatedLoc":"73","truncatedSloc":"57"},"mode":"file"},"image":false,"isCodeownersFile":null,"isValidLegacyIssueTemplate":false,"issueTemplateHelpUrl":"https://docs.github.com/articles/about-issue-and-pull-request-templates","issueTemplate":null,"discussionTemplate":null,"language":"Java","large":false,"loggedIn":false,"newDiscussionPath":"/palakurthimanjula/JAVA-/discussions/new","newIssuePath":"/palakurthimanjula/JAVA-/issues/new","planSupportInfo":{"repoIsFork":null,"repoOwnedByCurrentUser":null,"requestFullPath":"/palakurthimanjula/JAVA-/blob/main/Mobilepinchecking.java","showFreeOrgGatedFeatureMessage":null,"showPlanSupportBanner":null,"upgradeDataAttributes":null,"upgradePath":null},"publishBannersInfo":{"dismissActionNoticePath":"/settings/dismiss-notice/publish_action_from_dockerfile","dismissStackNoticePath":"/settings/dismiss-notice/publish_stack_from_file","releasePath":"/palakurthimanjula/JAVA-/releases/new?marketplace=true","showPublishActionBanner":false,"showPublishStackBanner":false},"renderImageOrRaw":false,"richText":null,"renderedFileInfo":null,"tabSize":8,"topBannersInfo":{"overridingGlobalFundingFile":false,"globalPreferredFundingPath":null,"repoOwner":"palakurthimanjula","repoName":"JAVA-","showInvalidCitationWarning":false,"citationHelpUrl":"https://docs.github.com/en/github/creating-cloning-and-archiving-repositories/creating-a-repository-on-github/about-citation-files","showDependabotConfigurationBanner":false,"actionsOnboardingTip":null},"truncated":false,"viewable":true,"workflowRedirectUrl":null,"symbols":{"timedOut":false,"notAnalyzed":false,"symbols":[{"name":"Mobilepinchecking","kind":"class","identStart":54,"identEnd":71,"extentStart":41,"extentEnd":2023,"fullyQualifiedName":"Mobilepinchecking","identUtf16":{"start":{"lineNumber":3,"utf16Col":13},"end":{"lineNumber":3,"utf16Col":30}},"extentUtf16":{"start":{"lineNumber":3,"utf16Col":0},"end":{"lineNumber":67,"utf16Col":1}}},{"name":"main","kind":"method","identStart":98,"identEnd":102,"extentStart":79,"extentEnd":1515,"fullyQualifiedName":"Mobilepinchecking::main","identUtf16":{"start":{"lineNumber":4,"utf16Col":23},"end":{"lineNumber":4,"utf16Col":27}},"extentUtf16":{"start":{"lineNumber":4,"utf16Col":4},"end":{"lineNumber":45,"utf16Col":5}}},{"name":"isNumeric","kind":"method","identStart":1550,"identEnd":1559,"extentStart":1527,"extentEnd":1743,"fullyQualifiedName":"Mobilepinchecking::isNumeric","identUtf16":{"start":{"lineNumber":47,"utf16Col":27},"end":{"lineNumber":47,"utf16Col":36}},"extentUtf16":{"start":{"lineNumber":47,"utf16Col":4},"end":{"lineNumber":54,"utf16Col":5}}},{"name":"isPrime","kind":"method","identStart":1778,"identEnd":1785,"extentStart":1755,"extentEnd":2020,"fullyQualifiedName":"Mobilepinchecking::isPrime","identUtf16":{"start":{"lineNumber":56,"utf16Col":27},"end":{"lineNumber":56,"utf16Col":34}},"extentUtf16":{"start":{"lineNumber":56,"utf16Col":4},"end":{"lineNumber":66,"utf16Col":5}}}]}},"copilotUserAccess":null,"csrf_tokens":{"/palakurthimanjula/JAVA-/branches":{"post":"YeSNdBS0mYaQKx0Yi9MT9RcqatVFRiOhhPrwqjYiyWXxLLUlmnfIf_ZUnVS2Hblgk9-L2A7sDajqJnQUeAYYJA"}}},"title":"JAVA-/Mobilepinchecking.java at main · palakurthimanjula/JAVA-","locale":"en"}