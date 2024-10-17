package com.practice.annotation.subsection01.primary;

import com.practice.annotation.common.Doraemon;
import com.practice.annotation.common.Pocket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("doraemonServicePrimary")
public class DoraemonService {

    private Pocket pocket;

    @Autowired
    public DoraemonService(Doraemon pocket) {
        this.pocket = pocket;
    }

    public void pocketShow() {
        pocket.show();
    }
}
