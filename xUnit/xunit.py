class TestCase:
    def __init__(self, name):
        self.name = name
    def setUp(self):
        pass
    def run(self):
        self.setUp()
        method = getattr(self, self.name)
        method()
        self.tearDown()
    def tearDown(self):
        pass
class WasRun(TestCase):
    def setUp(self):
        self.wasRun = None
        self.wasSetUp = 1
    def testMethod(self):
        self.wasRun = 1

class TestCaseTest(TestCase):
    def testRunning(self):
        test = WasRun("testMethod")
        assert not test.wasRun
        test.run()
        assert test.wasRun
    def testSetUp(self):
        self.test = WasRun("testMethod")
        self.test.run()
        assert self.test.wasSetUp

TestCaseTest("testRunning").run()
TestCaseTest("testSetUp").run()