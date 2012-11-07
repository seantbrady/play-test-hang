#!/usr/bin/perl

print "import org.junit.Test;\n";
print "import static org.fest.assertions.Assertions.assertThat;\n";
print "\n";
print "public class MyTest extends BaseTest {\n";
print "\n";

for($i = 1; $i <= 500; $i++) {
	print "    \@Test public void trueTest".$i."() { TestUtil.doTest(); }\n";
}

print "}\n";