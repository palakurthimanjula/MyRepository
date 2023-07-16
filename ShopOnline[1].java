{"payload":{"allShortcutsEnabled":false,"fileTree":{"":{"items":[{"name":"ASSIGNMENTPROGRAMSONPATTERNS (2).zip","path":"ASSIGNMENTPROGRAMSONPATTERNS (2).zip","contentType":"file"},{"name":"CollegeManagementRelationMapping.zip","path":"CollegeManagementRelationMapping.zip","contentType":"file"},{"name":"ElevatorProgram.java","path":"ElevatorProgram.java","contentType":"file"},{"name":"EmployeeDepartmentOneToManyBidirectional.zip","path":"EmployeeDepartmentOneToManyBidirectional.zip","contentType":"file"},{"name":"Mobilepinchecking.java","path":"Mobilepinchecking.java","contentType":"file"},{"name":"MovieManagementSystem_WithException.zip_expanded.zip","path":"MovieManagementSystem_WithException.zip_expanded.zip","contentType":"file"},{"name":"Moviemgt.zip","path":"Moviemgt.zip","contentType":"file"},{"name":"MoviemgtWithCollection.zip","path":"MoviemgtWithCollection.zip","contentType":"file"},{"name":"ShopOnline.java","path":"ShopOnline.java","contentType":"file"},{"name":"SingletonMain.java","path":"SingletonMain.java","contentType":"file"},{"name":"StudentData1.java","path":"StudentData1.java","contentType":"file"},{"name":"hibernate-onetoone-mapping1.zip","path":"hibernate-onetoone-mapping1.zip","contentType":"file"}],"totalCount":12}},"fileTreeProcessingTime":3.898417,"foldersToFetch":[],"reducedMotionEnabled":null,"repo":{"id":638830122,"defaultBranch":"main","name":"JAVA-","ownerLogin":"palakurthimanjula","currentUserCanPush":false,"isFork":false,"isEmpty":false,"createdAt":"2023-05-10T07:42:53.000Z","ownerAvatar":"https://avatars.githubusercontent.com/u/131944670?v=4","public":true,"private":false,"isOrgOwned":false},"refInfo":{"name":"main","listCacheKey":"v0:1686667643.528646","canEdit":false,"refType":"branch","currentOid":"ed461d5a9fa734f1f6156a959eb44ecb73a1839b"},"path":"ShopOnline.java","currentUser":null,"blob":{"rawLines":["package com.edu;\r","\r","import java.util.*;\r","\r","class Customer{\r","\tint id;\r","\tString name;\r","\tdouble walletBalance;\r","\tString address;\r","\t\r","\tpublic Customer(int id, String name, double walletBalance, String address) {\r","\t\tthis.id = id;\r","\t\tthis.name = name;\r","\t\tthis.walletBalance = walletBalance;\r","\t\tthis.address = address;\r","\t}\r","}\r","\r","class Item{\r","\tint id;\r","\tString name;\r","\tString companyName;\r","\tdouble price;\r","\tboolean isInStock;\r","\t\r","\tpublic Item(int id, String name, String companyName, double price, boolean isInStock) {\r","\t\tsuper();\r","\t\tthis.id = id;\r","\t\tthis.name = name;\r","\t\tthis.companyName = companyName;\r","\t\tthis.price = price;\r","\t\tthis.isInStock = isInStock;\r","\t}\r","}\r","\r","class ShoppingWebsite{\r","\tpublic String purchaseItem(Item i, Customer c) throws InsufficientBalanceException,ItemOutOfStockException{\r","\t\t\r","\t\tif(i.isInStock==false)\r","\t\t\tthrow new ItemOutOfStockException(\"Item is out of Stock\");\r","\t\telse if(i.price > c.walletBalance)\r","\t\t\tthrow new ItemOutOfStockException(\"Customer wallet balance in not sufficient\");\r","\t\telse \r","\t\t\treturn \"Order Successfull\";\r","\t}\r","}\r","\r","class InsufficientBalanceException extends Exception{\r","\tprivate static final long serialVersionUID = 1L;\r","\r","\tpublic InsufficientBalanceException(String message) {\r","\t\tsuper(message);\r","\t}\r","}\r","\r","class ItemOutOfStockException extends Exception{\r","\tprivate static final long serialVersionUID = 1L;\r","\r","\tpublic ItemOutOfStockException(String message) {\r","\t\tsuper(message);\r","\t}\r","}\r","public class ShopOnline {\r","\tpublic static void main(String[] args) throws InsufficientBalanceException, ItemOutOfStockException {\r","\t\t\r","\t\tCustomer cusDet = new Customer(927392, \"Steve\", 5000.0, \"USA\");\r","\t\tItem itemDet = new Item(27392, \"T-Shirt\", \"US polo\", 800, true);\r","\t\t\r","\t\tShoppingWebsite obj = new ShoppingWebsite();\r","\t\tString out = obj.purchaseItem(itemDet, cusDet);\r","\t\tSystem.out.println(out);\r","\t}\r","}\r","\r","\r","\r"],"stylingDirectives":[[{"start":0,"end":7,"cssClass":"pl-k"},{"start":8,"end":11,"cssClass":"pl-s1"},{"start":12,"end":15,"cssClass":"pl-s1"}],[],[{"start":0,"end":6,"cssClass":"pl-k"},{"start":7,"end":11,"cssClass":"pl-s1"},{"start":12,"end":16,"cssClass":"pl-s1"}],[],[{"start":0,"end":5,"cssClass":"pl-k"},{"start":6,"end":14,"cssClass":"pl-smi"}],[{"start":1,"end":4,"cssClass":"pl-smi"},{"start":5,"end":7,"cssClass":"pl-s1"}],[{"start":1,"end":7,"cssClass":"pl-smi"},{"start":8,"end":12,"cssClass":"pl-s1"}],[{"start":1,"end":7,"cssClass":"pl-smi"},{"start":8,"end":21,"cssClass":"pl-s1"}],[{"start":1,"end":7,"cssClass":"pl-smi"},{"start":8,"end":15,"cssClass":"pl-s1"}],[],[{"start":1,"end":7,"cssClass":"pl-k"},{"start":8,"end":16,"cssClass":"pl-smi"},{"start":17,"end":20,"cssClass":"pl-smi"},{"start":21,"end":23,"cssClass":"pl-s1"},{"start":25,"end":31,"cssClass":"pl-smi"},{"start":32,"end":36,"cssClass":"pl-s1"},{"start":38,"end":44,"cssClass":"pl-smi"},{"start":45,"end":58,"cssClass":"pl-s1"},{"start":60,"end":66,"cssClass":"pl-smi"},{"start":67,"end":74,"cssClass":"pl-s1"}],[{"start":2,"end":6,"cssClass":"pl-smi"},{"start":7,"end":9,"cssClass":"pl-s1"},{"start":12,"end":14,"cssClass":"pl-s1"}],[{"start":2,"end":6,"cssClass":"pl-smi"},{"start":7,"end":11,"cssClass":"pl-s1"},{"start":14,"end":18,"cssClass":"pl-s1"}],[{"start":2,"end":6,"cssClass":"pl-smi"},{"start":7,"end":20,"cssClass":"pl-s1"},{"start":23,"end":36,"cssClass":"pl-s1"}],[{"start":2,"end":6,"cssClass":"pl-smi"},{"start":7,"end":14,"cssClass":"pl-s1"},{"start":17,"end":24,"cssClass":"pl-s1"}],[],[],[],[{"start":0,"end":5,"cssClass":"pl-k"},{"start":6,"end":10,"cssClass":"pl-smi"}],[{"start":1,"end":4,"cssClass":"pl-smi"},{"start":5,"end":7,"cssClass":"pl-s1"}],[{"start":1,"end":7,"cssClass":"pl-smi"},{"start":8,"end":12,"cssClass":"pl-s1"}],[{"start":1,"end":7,"cssClass":"pl-smi"},{"start":8,"end":19,"cssClass":"pl-s1"}],[{"start":1,"end":7,"cssClass":"pl-smi"},{"start":8,"end":13,"cssClass":"pl-s1"}],[{"start":1,"end":8,"cssClass":"pl-smi"},{"start":9,"end":18,"cssClass":"pl-s1"}],[],[{"start":1,"end":7,"cssClass":"pl-k"},{"start":8,"end":12,"cssClass":"pl-smi"},{"start":13,"end":16,"cssClass":"pl-smi"},{"start":17,"end":19,"cssClass":"pl-s1"},{"start":21,"end":27,"cssClass":"pl-smi"},{"start":28,"end":32,"cssClass":"pl-s1"},{"start":34,"end":40,"cssClass":"pl-smi"},{"start":41,"end":52,"cssClass":"pl-s1"},{"start":54,"end":60,"cssClass":"pl-smi"},{"start":61,"end":66,"cssClass":"pl-s1"},{"start":68,"end":75,"cssClass":"pl-smi"},{"start":76,"end":85,"cssClass":"pl-s1"}],[{"start":2,"end":7,"cssClass":"pl-en"}],[{"start":2,"end":6,"cssClass":"pl-smi"},{"start":7,"end":9,"cssClass":"pl-s1"},{"start":12,"end":14,"cssClass":"pl-s1"}],[{"start":2,"end":6,"cssClass":"pl-smi"},{"start":7,"end":11,"cssClass":"pl-s1"},{"start":14,"end":18,"cssClass":"pl-s1"}],[{"start":2,"end":6,"cssClass":"pl-smi"},{"start":7,"end":18,"cssClass":"pl-s1"},{"start":21,"end":32,"cssClass":"pl-s1"}],[{"start":2,"end":6,"cssClass":"pl-smi"},{"start":7,"end":12,"cssClass":"pl-s1"},{"start":15,"end":20,"cssClass":"pl-s1"}],[{"start":2,"end":6,"cssClass":"pl-smi"},{"start":7,"end":16,"cssClass":"pl-s1"},{"start":19,"end":28,"cssClass":"pl-s1"}],[],[],[],[{"start":0,"end":5,"cssClass":"pl-k"},{"start":6,"end":21,"cssClass":"pl-smi"}],[{"start":1,"end":7,"cssClass":"pl-k"},{"start":8,"end":14,"cssClass":"pl-smi"},{"start":15,"end":27,"cssClass":"pl-en"},{"start":28,"end":32,"cssClass":"pl-smi"},{"start":33,"end":34,"cssClass":"pl-s1"},{"start":36,"end":44,"cssClass":"pl-smi"},{"start":45,"end":46,"cssClass":"pl-s1"},{"start":48,"end":54,"cssClass":"pl-k"},{"start":55,"end":83,"cssClass":"pl-smi"},{"start":84,"end":107,"cssClass":"pl-smi"}],[],[{"start":2,"end":4,"cssClass":"pl-k"},{"start":5,"end":6,"cssClass":"pl-s1"},{"start":7,"end":16,"cssClass":"pl-s1"},{"start":18,"end":23,"cssClass":"pl-c1"}],[{"start":3,"end":8,"cssClass":"pl-k"},{"start":9,"end":12,"cssClass":"pl-k"},{"start":13,"end":36,"cssClass":"pl-smi"},{"start":37,"end":59,"cssClass":"pl-s"}],[{"start":2,"end":6,"cssClass":"pl-k"},{"start":7,"end":9,"cssClass":"pl-k"},{"start":10,"end":11,"cssClass":"pl-s1"},{"start":12,"end":17,"cssClass":"pl-s1"},{"start":20,"end":21,"cssClass":"pl-s1"},{"start":22,"end":35,"cssClass":"pl-s1"}],[{"start":3,"end":8,"cssClass":"pl-k"},{"start":9,"end":12,"cssClass":"pl-k"},{"start":13,"end":36,"cssClass":"pl-smi"},{"start":37,"end":80,"cssClass":"pl-s"}],[{"start":2,"end":6,"cssClass":"pl-k"}],[{"start":3,"end":9,"cssClass":"pl-k"},{"start":10,"end":29,"cssClass":"pl-s"}],[],[],[],[{"start":0,"end":5,"cssClass":"pl-k"},{"start":6,"end":34,"cssClass":"pl-smi"},{"start":35,"end":42,"cssClass":"pl-k"},{"start":43,"end":52,"cssClass":"pl-smi"}],[{"start":1,"end":8,"cssClass":"pl-k"},{"start":9,"end":15,"cssClass":"pl-k"},{"start":16,"end":21,"cssClass":"pl-k"},{"start":22,"end":26,"cssClass":"pl-smi"},{"start":27,"end":43,"cssClass":"pl-s1"},{"start":46,"end":48,"cssClass":"pl-c1"}],[],[{"start":1,"end":7,"cssClass":"pl-k"},{"start":8,"end":36,"cssClass":"pl-smi"},{"start":37,"end":43,"cssClass":"pl-smi"},{"start":44,"end":51,"cssClass":"pl-s1"}],[{"start":2,"end":7,"cssClass":"pl-en"},{"start":8,"end":15,"cssClass":"pl-s1"}],[],[],[],[{"start":0,"end":5,"cssClass":"pl-k"},{"start":6,"end":29,"cssClass":"pl-smi"},{"start":30,"end":37,"cssClass":"pl-k"},{"start":38,"end":47,"cssClass":"pl-smi"}],[{"start":1,"end":8,"cssClass":"pl-k"},{"start":9,"end":15,"cssClass":"pl-k"},{"start":16,"end":21,"cssClass":"pl-k"},{"start":22,"end":26,"cssClass":"pl-smi"},{"start":27,"end":43,"cssClass":"pl-s1"},{"start":46,"end":48,"cssClass":"pl-c1"}],[],[{"start":1,"end":7,"cssClass":"pl-k"},{"start":8,"end":31,"cssClass":"pl-smi"},{"start":32,"end":38,"cssClass":"pl-smi"},{"start":39,"end":46,"cssClass":"pl-s1"}],[{"start":2,"end":7,"cssClass":"pl-en"},{"start":8,"end":15,"cssClass":"pl-s1"}],[],[],[{"start":0,"end":6,"cssClass":"pl-k"},{"start":7,"end":12,"cssClass":"pl-k"},{"start":13,"end":23,"cssClass":"pl-smi"}],[{"start":1,"end":7,"cssClass":"pl-k"},{"start":8,"end":14,"cssClass":"pl-k"},{"start":15,"end":19,"cssClass":"pl-smi"},{"start":20,"end":24,"cssClass":"pl-en"},{"start":25,"end":31,"cssClass":"pl-smi"},{"start":34,"end":38,"cssClass":"pl-s1"},{"start":40,"end":46,"cssClass":"pl-k"},{"start":47,"end":75,"cssClass":"pl-smi"},{"start":77,"end":100,"cssClass":"pl-smi"}],[],[{"start":2,"end":10,"cssClass":"pl-smi"},{"start":11,"end":17,"cssClass":"pl-s1"},{"start":20,"end":23,"cssClass":"pl-k"},{"start":24,"end":32,"cssClass":"pl-smi"},{"start":33,"end":39,"cssClass":"pl-c1"},{"start":41,"end":48,"cssClass":"pl-s"},{"start":50,"end":56,"cssClass":"pl-c1"},{"start":58,"end":63,"cssClass":"pl-s"}],[{"start":2,"end":6,"cssClass":"pl-smi"},{"start":7,"end":14,"cssClass":"pl-s1"},{"start":17,"end":20,"cssClass":"pl-k"},{"start":21,"end":25,"cssClass":"pl-smi"},{"start":26,"end":31,"cssClass":"pl-c1"},{"start":33,"end":42,"cssClass":"pl-s"},{"start":44,"end":53,"cssClass":"pl-s"},{"start":55,"end":58,"cssClass":"pl-c1"},{"start":60,"end":64,"cssClass":"pl-c1"}],[],[{"start":2,"end":17,"cssClass":"pl-smi"},{"start":18,"end":21,"cssClass":"pl-s1"},{"start":24,"end":27,"cssClass":"pl-k"},{"start":28,"end":43,"cssClass":"pl-smi"}],[{"start":2,"end":8,"cssClass":"pl-smi"},{"start":9,"end":12,"cssClass":"pl-s1"},{"start":15,"end":18,"cssClass":"pl-s1"},{"start":19,"end":31,"cssClass":"pl-en"},{"start":32,"end":39,"cssClass":"pl-s1"},{"start":41,"end":47,"cssClass":"pl-s1"}],[{"start":2,"end":8,"cssClass":"pl-smi"},{"start":9,"end":12,"cssClass":"pl-s1"},{"start":13,"end":20,"cssClass":"pl-en"},{"start":21,"end":24,"cssClass":"pl-s1"}],[],[],[],[],[]],"csv":null,"csvError":null,"dependabotInfo":{"showConfigurationBanner":false,"configFilePath":null,"networkDependabotPath":"/palakurthimanjula/JAVA-/network/updates","dismissConfigurationNoticePath":"/settings/dismiss-notice/dependabot_configuration_notice","configurationNoticeDismissed":null,"repoAlertsPath":"/palakurthimanjula/JAVA-/security/dependabot","repoSecurityAndAnalysisPath":"/palakurthimanjula/JAVA-/settings/security_analysis","repoOwnerIsOrg":false,"currentUserCanAdminRepo":false},"displayName":"ShopOnline.java","displayUrl":"https://github.com/palakurthimanjula/JAVA-/blob/main/ShopOnline.java?raw=true","headerInfo":{"blobSize":"1.8 KB","deleteInfo":{"deletePath":null,"deleteTooltip":"You must be signed in to make or propose changes"},"editInfo":{"editTooltip":"You must be signed in to make or propose changes"},"ghDesktopPath":"https://desktop.github.com","gitLfsPath":null,"onBranch":true,"shortPath":"d25a1e8","siteNavLoginPath":"/login?return_to=https%3A%2F%2Fgithub.com%2Fpalakurthimanjula%2FJAVA-%2Fblob%2Fmain%2FShopOnline.java","isCSV":false,"isRichtext":false,"toc":null,"lineInfo":{"truncatedLoc":"76","truncatedSloc":"60"},"mode":"file"},"image":false,"isCodeownersFile":null,"isValidLegacyIssueTemplate":false,"issueTemplateHelpUrl":"https://docs.github.com/articles/about-issue-and-pull-request-templates","issueTemplate":null,"discussionTemplate":null,"language":"Java","large":false,"loggedIn":false,"newDiscussionPath":"/palakurthimanjula/JAVA-/discussions/new","newIssuePath":"/palakurthimanjula/JAVA-/issues/new","planSupportInfo":{"repoIsFork":null,"repoOwnedByCurrentUser":null,"requestFullPath":"/palakurthimanjula/JAVA-/blob/main/ShopOnline.java","showFreeOrgGatedFeatureMessage":null,"showPlanSupportBanner":null,"upgradeDataAttributes":null,"upgradePath":null},"publishBannersInfo":{"dismissActionNoticePath":"/settings/dismiss-notice/publish_action_from_dockerfile","dismissStackNoticePath":"/settings/dismiss-notice/publish_stack_from_file","releasePath":"/palakurthimanjula/JAVA-/releases/new?marketplace=true","showPublishActionBanner":false,"showPublishStackBanner":false},"renderImageOrRaw":false,"richText":null,"renderedFileInfo":null,"tabSize":8,"topBannersInfo":{"overridingGlobalFundingFile":false,"globalPreferredFundingPath":null,"repoOwner":"palakurthimanjula","repoName":"JAVA-","showInvalidCitationWarning":false,"citationHelpUrl":"https://docs.github.com/en/github/creating-cloning-and-archiving-repositories/creating-a-repository-on-github/about-citation-files","showDependabotConfigurationBanner":false,"actionsOnboardingTip":null},"truncated":false,"viewable":true,"workflowRedirectUrl":null,"symbols":{"timedOut":false,"notAnalyzed":false,"symbols":[{"name":"Customer","kind":"class","identStart":49,"identEnd":57,"extentStart":43,"extentEnd":318,"fullyQualifiedName":"Customer","identUtf16":{"start":{"lineNumber":4,"utf16Col":6},"end":{"lineNumber":4,"utf16Col":14}},"extentUtf16":{"start":{"lineNumber":4,"utf16Col":0},"end":{"lineNumber":16,"utf16Col":1}}},{"name":"id","kind":"field","identStart":65,"identEnd":67,"extentStart":61,"extentEnd":68,"fullyQualifiedName":"Customer::id","identUtf16":{"start":{"lineNumber":5,"utf16Col":5},"end":{"lineNumber":5,"utf16Col":7}},"extentUtf16":{"start":{"lineNumber":5,"utf16Col":1},"end":{"lineNumber":5,"utf16Col":8}}},{"name":"name","kind":"field","identStart":78,"identEnd":82,"extentStart":71,"extentEnd":83,"fullyQualifiedName":"Customer::name","identUtf16":{"start":{"lineNumber":6,"utf16Col":8},"end":{"lineNumber":6,"utf16Col":12}},"extentUtf16":{"start":{"lineNumber":6,"utf16Col":1},"end":{"lineNumber":6,"utf16Col":13}}},{"name":"walletBalance","kind":"field","identStart":93,"identEnd":106,"extentStart":86,"extentEnd":107,"fullyQualifiedName":"Customer::walletBalance","identUtf16":{"start":{"lineNumber":7,"utf16Col":8},"end":{"lineNumber":7,"utf16Col":21}},"extentUtf16":{"start":{"lineNumber":7,"utf16Col":1},"end":{"lineNumber":7,"utf16Col":22}}},{"name":"address","kind":"field","identStart":117,"identEnd":124,"extentStart":110,"extentEnd":125,"fullyQualifiedName":"Customer::address","identUtf16":{"start":{"lineNumber":8,"utf16Col":8},"end":{"lineNumber":8,"utf16Col":15}},"extentUtf16":{"start":{"lineNumber":8,"utf16Col":1},"end":{"lineNumber":8,"utf16Col":16}}},{"name":"Customer","kind":"method","identStart":138,"identEnd":146,"extentStart":131,"extentEnd":315,"fullyQualifiedName":"Customer::Customer","identUtf16":{"start":{"lineNumber":10,"utf16Col":8},"end":{"lineNumber":10,"utf16Col":16}},"extentUtf16":{"start":{"lineNumber":10,"utf16Col":1},"end":{"lineNumber":15,"utf16Col":2}}},{"name":"Item","kind":"class","identStart":328,"identEnd":332,"extentStart":322,"extentEnd":656,"fullyQualifiedName":"Item","identUtf16":{"start":{"lineNumber":18,"utf16Col":6},"end":{"lineNumber":18,"utf16Col":10}},"extentUtf16":{"start":{"lineNumber":18,"utf16Col":0},"end":{"lineNumber":33,"utf16Col":1}}},{"name":"id","kind":"field","identStart":340,"identEnd":342,"extentStart":336,"extentEnd":343,"fullyQualifiedName":"Item::id","identUtf16":{"start":{"lineNumber":19,"utf16Col":5},"end":{"lineNumber":19,"utf16Col":7}},"extentUtf16":{"start":{"lineNumber":19,"utf16Col":1},"end":{"lineNumber":19,"utf16Col":8}}},{"name":"name","kind":"field","identStart":353,"identEnd":357,"extentStart":346,"extentEnd":358,"fullyQualifiedName":"Item::name","identUtf16":{"start":{"lineNumber":20,"utf16Col":8},"end":{"lineNumber":20,"utf16Col":12}},"extentUtf16":{"start":{"lineNumber":20,"utf16Col":1},"end":{"lineNumber":20,"utf16Col":13}}},{"name":"companyName","kind":"field","identStart":368,"identEnd":379,"extentStart":361,"extentEnd":380,"fullyQualifiedName":"Item::companyName","identUtf16":{"start":{"lineNumber":21,"utf16Col":8},"end":{"lineNumber":21,"utf16Col":19}},"extentUtf16":{"start":{"lineNumber":21,"utf16Col":1},"end":{"lineNumber":21,"utf16Col":20}}},{"name":"price","kind":"field","identStart":390,"identEnd":395,"extentStart":383,"extentEnd":396,"fullyQualifiedName":"Item::price","identUtf16":{"start":{"lineNumber":22,"utf16Col":8},"end":{"lineNumber":22,"utf16Col":13}},"extentUtf16":{"start":{"lineNumber":22,"utf16Col":1},"end":{"lineNumber":22,"utf16Col":14}}},{"name":"isInStock","kind":"field","identStart":407,"identEnd":416,"extentStart":399,"extentEnd":417,"fullyQualifiedName":"Item::isInStock","identUtf16":{"start":{"lineNumber":23,"utf16Col":9},"end":{"lineNumber":23,"utf16Col":18}},"extentUtf16":{"start":{"lineNumber":23,"utf16Col":1},"end":{"lineNumber":23,"utf16Col":19}}},{"name":"Item","kind":"method","identStart":430,"identEnd":434,"extentStart":423,"extentEnd":653,"fullyQualifiedName":"Item::Item","identUtf16":{"start":{"lineNumber":25,"utf16Col":8},"end":{"lineNumber":25,"utf16Col":12}},"extentUtf16":{"start":{"lineNumber":25,"utf16Col":1},"end":{"lineNumber":32,"utf16Col":2}}},{"name":"ShoppingWebsite","kind":"class","identStart":666,"identEnd":681,"extentStart":660,"extentEnd":1055,"fullyQualifiedName":"ShoppingWebsite","identUtf16":{"start":{"lineNumber":35,"utf16Col":6},"end":{"lineNumber":35,"utf16Col":21}},"extentUtf16":{"start":{"lineNumber":35,"utf16Col":0},"end":{"lineNumber":45,"utf16Col":1}}},{"name":"purchaseItem","kind":"method","identStart":699,"identEnd":711,"extentStart":685,"extentEnd":1052,"fullyQualifiedName":"ShoppingWebsite::purchaseItem","identUtf16":{"start":{"lineNumber":36,"utf16Col":15},"end":{"lineNumber":36,"utf16Col":27}},"extentUtf16":{"start":{"lineNumber":36,"utf16Col":1},"end":{"lineNumber":44,"utf16Col":2}}},{"name":"InsufficientBalanceException","kind":"class","identStart":1065,"identEnd":1093,"extentStart":1059,"extentEnd":1247,"fullyQualifiedName":"InsufficientBalanceException","identUtf16":{"start":{"lineNumber":47,"utf16Col":6},"end":{"lineNumber":47,"utf16Col":34}},"extentUtf16":{"start":{"lineNumber":47,"utf16Col":0},"end":{"lineNumber":53,"utf16Col":1}}},{"name":"serialVersionUID","kind":"field","identStart":1141,"identEnd":1157,"extentStart":1115,"extentEnd":1163,"fullyQualifiedName":"InsufficientBalanceException::serialVersionUID","identUtf16":{"start":{"lineNumber":48,"utf16Col":27},"end":{"lineNumber":48,"utf16Col":43}},"extentUtf16":{"start":{"lineNumber":48,"utf16Col":1},"end":{"lineNumber":48,"utf16Col":49}}},{"name":"InsufficientBalanceException","kind":"method","identStart":1175,"identEnd":1203,"extentStart":1168,"extentEnd":1244,"fullyQualifiedName":"InsufficientBalanceException::InsufficientBalanceException","identUtf16":{"start":{"lineNumber":50,"utf16Col":8},"end":{"lineNumber":50,"utf16Col":36}},"extentUtf16":{"start":{"lineNumber":50,"utf16Col":1},"end":{"lineNumber":52,"utf16Col":2}}},{"name":"ItemOutOfStockException","kind":"class","identStart":1257,"identEnd":1280,"extentStart":1251,"extentEnd":1429,"fullyQualifiedName":"ItemOutOfStockException","identUtf16":{"start":{"lineNumber":55,"utf16Col":6},"end":{"lineNumber":55,"utf16Col":29}},"extentUtf16":{"start":{"lineNumber":55,"utf16Col":0},"end":{"lineNumber":61,"utf16Col":1}}},{"name":"serialVersionUID","kind":"field","identStart":1328,"identEnd":1344,"extentStart":1302,"extentEnd":1350,"fullyQualifiedName":"ItemOutOfStockException::serialVersionUID","identUtf16":{"start":{"lineNumber":56,"utf16Col":27},"end":{"lineNumber":56,"utf16Col":43}},"extentUtf16":{"start":{"lineNumber":56,"utf16Col":1},"end":{"lineNumber":56,"utf16Col":49}}},{"name":"ItemOutOfStockException","kind":"method","identStart":1362,"identEnd":1385,"extentStart":1355,"extentEnd":1426,"fullyQualifiedName":"ItemOutOfStockException::ItemOutOfStockException","identUtf16":{"start":{"lineNumber":58,"utf16Col":8},"end":{"lineNumber":58,"utf16Col":31}},"extentUtf16":{"start":{"lineNumber":58,"utf16Col":1},"end":{"lineNumber":60,"utf16Col":2}}},{"name":"ShopOnline","kind":"class","identStart":1444,"identEnd":1454,"extentStart":1431,"extentEnd":1837,"fullyQualifiedName":"ShopOnline","identUtf16":{"start":{"lineNumber":62,"utf16Col":13},"end":{"lineNumber":62,"utf16Col":23}},"extentUtf16":{"start":{"lineNumber":62,"utf16Col":0},"end":{"lineNumber":72,"utf16Col":1}}},{"name":"main","kind":"method","identStart":1478,"identEnd":1482,"extentStart":1459,"extentEnd":1834,"fullyQualifiedName":"ShopOnline::main","identUtf16":{"start":{"lineNumber":63,"utf16Col":20},"end":{"lineNumber":63,"utf16Col":24}},"extentUtf16":{"start":{"lineNumber":63,"utf16Col":1},"end":{"lineNumber":71,"utf16Col":2}}}]}},"copilotUserAccess":null,"csrf_tokens":{"/palakurthimanjula/JAVA-/branches":{"post":"HxPkMmWapv-fYn6kKk6ZmG9BL43B7igZrgmFm6kR3NO9mlfI_-eQLutS0ttBai5VyZTYYxuanc0jbn0z-PUvlQ"}}},"title":"JAVA-/ShopOnline.java at main · palakurthimanjula/JAVA-","locale":"en"}