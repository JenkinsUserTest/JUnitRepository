package com.yash.test;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.IncludePackages;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages({"com.yash.test","com.yash.test1"})
@IncludePackages("com.yash.test")
//@SelectClasses({JUnit5TestCase.class})
@ExcludeTags("PROD")
@IncludeTags("DEV")
public class JUnit5TestSuites {

}
