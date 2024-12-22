package com.luwis.code;

import com.luwis.nowcode.NowCodeApplication;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = NowCodeApplication.class)
class NowCodeTest {



    @Test
    public void test() {
        int[] arr = {2, 3, 6, 7};
        int target = 7;
        System.out.println(new a0039combinationSum().combinationSum(arr, target));


    }

}
