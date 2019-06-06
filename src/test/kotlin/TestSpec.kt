import com.mms.casestudy.Encrypt
import org.amshove.kluent.shouldEqual
import org.spekframework.spek2.Spek


object TestSpec : Spek({

    group("CaseStudyTest") {
        test("Check Rule 1") {

            val input = "ROBERTA EIKELSTEIN"

            val encrypt = Encrypt()
            val result = encrypt.replaceCharsRuleOne(input.toCharArray())

            String(result).shouldEqual("POBGPTK GTLGLYTGTN")


        }

        test("Check Rule 2") {

            val input = "POBGPTK GTLGLYTGTN"

            val encrypt = Encrypt()
            val result = encrypt.rule2(input.toCharArray())

            String(result).shouldEqual("JKXSJFO SFNSNAFSFL")

        }

        test("Check Rule 3") {

            val input = "JKXSJFO SFNSNAFSFL"

            val encrypt = Encrypt()
            val result = encrypt.replaceCharsRuleThree(input.toCharArray())

            String(result).shouldEqual("JKXIJFK IFNINAFIFL")

        }
    }
})