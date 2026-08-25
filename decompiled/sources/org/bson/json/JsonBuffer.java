package org.bson.json;

/* JADX INFO: loaded from: classes3.dex */
interface JsonBuffer {
    void discard(int r1);

    int getPosition();

    int mark();

    int read();

    void reset(int r1);

    void unread(int r1);
}
