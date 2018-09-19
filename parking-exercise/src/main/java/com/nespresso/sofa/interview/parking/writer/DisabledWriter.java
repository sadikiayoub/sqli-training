package com.nespresso.sofa.interview.parking.writer;

import java.io.IOException;

final class DisabledWriter implements Writable {

    @Override
    public Appendable write(Appendable appendable) throws IOException {
        return appendable.append("@");
    }
}