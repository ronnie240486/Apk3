package androidx.leanback.util;

/* JADX INFO: loaded from: classes3.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public final class StateMachine {
    public static final int STATUS_INVOKED = 1;
    public static final int STATUS_ZERO = 0;
    public final java.util.ArrayList<androidx.leanback.util.StateMachine.State> mFinishedStates;
    public final java.util.ArrayList<androidx.leanback.util.StateMachine.State> mStates;
    public final java.util.ArrayList<androidx.leanback.util.StateMachine.State> mUnfinishedStates;

    /* JADX INFO: loaded from: classes.dex */
    public static class Condition {
        public final java.lang.String mName;

        public Condition(java.lang.String r1) {
                r0 = this;
                r0.<init>()
                r0.mName = r1
                return
        }

        public boolean canProceed() {
                r1 = this;
                r0 = 1
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class Event {
        public final java.lang.String mName;

        public Event(java.lang.String r1) {
                r0 = this;
                r0.<init>()
                r0.mName = r1
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class State {
        public final boolean mBranchEnd;
        public final boolean mBranchStart;
        public java.util.ArrayList<androidx.leanback.util.StateMachine.Transition> mIncomings;
        public int mInvokedOutTransitions;
        public final java.lang.String mName;
        public java.util.ArrayList<androidx.leanback.util.StateMachine.Transition> mOutgoings;
        public int mStatus;

        public State(java.lang.String r3) {
                r2 = this;
                r0 = 0
                r1 = 1
                r2.<init>(r3, r0, r1)
                return
        }

        public State(java.lang.String r2, boolean r3, boolean r4) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.mStatus = r0
                r1.mInvokedOutTransitions = r0
                r1.mName = r2
                r1.mBranchStart = r3
                r1.mBranchEnd = r4
                return
        }

        public final void addIncoming(androidx.leanback.util.StateMachine.Transition r2) {
                r1 = this;
                java.util.ArrayList<androidx.leanback.util.StateMachine$Transition> r0 = r1.mIncomings
                if (r0 != 0) goto Lb
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.mIncomings = r0
            Lb:
                java.util.ArrayList<androidx.leanback.util.StateMachine$Transition> r0 = r1.mIncomings
                r0.add(r2)
                return
        }

        public final void addOutgoing(androidx.leanback.util.StateMachine.Transition r2) {
                r1 = this;
                java.util.ArrayList<androidx.leanback.util.StateMachine$Transition> r0 = r1.mOutgoings
                if (r0 != 0) goto Lb
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.mOutgoings = r0
            Lb:
                java.util.ArrayList<androidx.leanback.util.StateMachine$Transition> r0 = r1.mOutgoings
                r0.add(r2)
                return
        }

        public final int getStatus() {
                r1 = this;
                int r0 = r1.mStatus
                return r0
        }

        public void run() {
                r0 = this;
                return
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.String r0 = "["
                java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
                java.lang.String r1 = r3.mName
                r0.append(r1)
                java.lang.String r1 = " "
                r0.append(r1)
                int r1 = r3.mStatus
                java.lang.String r2 = "]"
                java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1, r2)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class Transition {
        public final androidx.leanback.util.StateMachine.Condition mCondition;
        public final androidx.leanback.util.StateMachine.Event mEvent;
        public final androidx.leanback.util.StateMachine.State mFromState;
        public int mState;
        public final androidx.leanback.util.StateMachine.State mToState;

        public Transition(androidx.leanback.util.StateMachine.State r2, androidx.leanback.util.StateMachine.State r3) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.mState = r0
                r1.mFromState = r2
                r1.mToState = r3
                r2 = 0
                r1.mEvent = r2
                r1.mCondition = r2
                return
        }

        public Transition(androidx.leanback.util.StateMachine.State r2, androidx.leanback.util.StateMachine.State r3, androidx.leanback.util.StateMachine.Condition r4) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.mState = r0
                if (r4 == 0) goto L12
                r1.mFromState = r2
                r1.mToState = r3
                r2 = 0
                r1.mEvent = r2
                r1.mCondition = r4
                return
            L12:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                r2.<init>()
                throw r2
        }

        public Transition(androidx.leanback.util.StateMachine.State r2, androidx.leanback.util.StateMachine.State r3, androidx.leanback.util.StateMachine.Event r4) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.mState = r0
                if (r4 == 0) goto L12
                r1.mFromState = r2
                r1.mToState = r3
                r1.mEvent = r4
                r2 = 0
                r1.mCondition = r2
                return
            L12:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                r2.<init>()
                throw r2
        }

        public java.lang.String toString() {
                r5 = this;
                androidx.leanback.util.StateMachine$Event r0 = r5.mEvent
                if (r0 == 0) goto L7
                java.lang.String r0 = r0.mName
                goto L10
            L7:
                androidx.leanback.util.StateMachine$Condition r0 = r5.mCondition
                if (r0 == 0) goto Le
                java.lang.String r0 = r0.mName
                goto L10
            Le:
                java.lang.String r0 = "auto"
            L10:
                java.lang.String r1 = "["
                java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
                androidx.leanback.util.StateMachine$State r2 = r5.mFromState
                java.lang.String r2 = r2.mName
                r1.append(r2)
                java.lang.String r2 = " -> "
                r1.append(r2)
                androidx.leanback.util.StateMachine$State r2 = r5.mToState
                java.lang.String r2 = r2.mName
                java.lang.String r3 = " <"
                java.lang.String r4 = ">]"
                java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r2, r3, r0, r4)
                return r0
        }
    }

    public StateMachine() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mStates = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mFinishedStates = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mUnfinishedStates = r0
            return
    }

    public void addState(androidx.leanback.util.StateMachine.State r2) {
            r1 = this;
            java.util.ArrayList<androidx.leanback.util.StateMachine$State> r0 = r1.mStates
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto Ld
            java.util.ArrayList<androidx.leanback.util.StateMachine$State> r0 = r1.mStates
            r0.add(r2)
        Ld:
            return
    }

    public void addTransition(androidx.leanback.util.StateMachine.State r2, androidx.leanback.util.StateMachine.State r3) {
            r1 = this;
            androidx.leanback.util.StateMachine$Transition r0 = new androidx.leanback.util.StateMachine$Transition
            r0.<init>(r2, r3)
            r3.addIncoming(r0)
            r2.addOutgoing(r0)
            return
    }

    public void addTransition(androidx.leanback.util.StateMachine.State r2, androidx.leanback.util.StateMachine.State r3, androidx.leanback.util.StateMachine.Condition r4) {
            r1 = this;
            androidx.leanback.util.StateMachine$Transition r0 = new androidx.leanback.util.StateMachine$Transition
            r0.<init>(r2, r3, r4)
            r3.addIncoming(r0)
            r2.addOutgoing(r0)
            return
    }

    public void addTransition(androidx.leanback.util.StateMachine.State r2, androidx.leanback.util.StateMachine.State r3, androidx.leanback.util.StateMachine.Event r4) {
            r1 = this;
            androidx.leanback.util.StateMachine$Transition r0 = new androidx.leanback.util.StateMachine$Transition
            r0.<init>(r2, r3, r4)
            r3.addIncoming(r0)
            r2.addOutgoing(r0)
            return
    }

    public void fireEvent(androidx.leanback.util.StateMachine.Event r7) {
            r6 = this;
            r0 = 0
        L1:
            java.util.ArrayList<androidx.leanback.util.StateMachine$State> r1 = r6.mFinishedStates
            int r1 = r1.size()
            if (r0 >= r1) goto L45
            java.util.ArrayList<androidx.leanback.util.StateMachine$State> r1 = r6.mFinishedStates
            java.lang.Object r1 = r1.get(r0)
            androidx.leanback.util.StateMachine$State r1 = (androidx.leanback.util.StateMachine.State) r1
            java.util.ArrayList<androidx.leanback.util.StateMachine$Transition> r2 = r1.mOutgoings
            if (r2 == 0) goto L42
            boolean r3 = r1.mBranchStart
            if (r3 != 0) goto L1e
            int r3 = r1.mInvokedOutTransitions
            if (r3 <= 0) goto L1e
            goto L42
        L1e:
            java.util.Iterator r2 = r2.iterator()
        L22:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L42
            java.lang.Object r3 = r2.next()
            androidx.leanback.util.StateMachine$Transition r3 = (androidx.leanback.util.StateMachine.Transition) r3
            int r4 = r3.mState
            r5 = 1
            if (r4 == r5) goto L22
            androidx.leanback.util.StateMachine$Event r4 = r3.mEvent
            if (r4 != r7) goto L22
            r3.mState = r5
            int r3 = r1.mInvokedOutTransitions
            int r3 = r3 + r5
            r1.mInvokedOutTransitions = r3
            boolean r3 = r1.mBranchStart
            if (r3 != 0) goto L22
        L42:
            int r0 = r0 + 1
            goto L1
        L45:
            r6.runUnfinishedStates()
            return
    }

    public void reset() {
            r4 = this;
            java.util.ArrayList<androidx.leanback.util.StateMachine$State> r0 = r4.mUnfinishedStates
            r0.clear()
            java.util.ArrayList<androidx.leanback.util.StateMachine$State> r0 = r4.mFinishedStates
            r0.clear()
            java.util.ArrayList<androidx.leanback.util.StateMachine$State> r0 = r4.mStates
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L38
            java.lang.Object r1 = r0.next()
            androidx.leanback.util.StateMachine$State r1 = (androidx.leanback.util.StateMachine.State) r1
            r2 = 0
            r1.mStatus = r2
            r1.mInvokedOutTransitions = r2
            java.util.ArrayList<androidx.leanback.util.StateMachine$Transition> r1 = r1.mOutgoings
            if (r1 == 0) goto L10
            java.util.Iterator r1 = r1.iterator()
        L29:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L10
            java.lang.Object r3 = r1.next()
            androidx.leanback.util.StateMachine$Transition r3 = (androidx.leanback.util.StateMachine.Transition) r3
            r3.mState = r2
            goto L29
        L38:
            return
    }

    public final void runUnfinishedStates() {
            r8 = this;
        L0:
            java.util.ArrayList<androidx.leanback.util.StateMachine$State> r0 = r8.mUnfinishedStates
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
            r3 = 0
        La:
            if (r0 < 0) goto L95
            java.util.ArrayList<androidx.leanback.util.StateMachine$State> r4 = r8.mUnfinishedStates
            java.lang.Object r4 = r4.get(r0)
            androidx.leanback.util.StateMachine$State r4 = (androidx.leanback.util.StateMachine.State) r4
            int r5 = r4.mStatus
            if (r5 == r1) goto L83
            java.util.ArrayList<androidx.leanback.util.StateMachine$Transition> r5 = r4.mIncomings
            if (r5 != 0) goto L1d
            goto L4a
        L1d:
            boolean r6 = r4.mBranchEnd
            if (r6 == 0) goto L36
            java.util.Iterator r5 = r5.iterator()
        L25:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L4a
            java.lang.Object r6 = r5.next()
            androidx.leanback.util.StateMachine$Transition r6 = (androidx.leanback.util.StateMachine.Transition) r6
            int r6 = r6.mState
            if (r6 == r1) goto L25
            goto L4c
        L36:
            java.util.Iterator r5 = r5.iterator()
        L3a:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L4c
            java.lang.Object r6 = r5.next()
            androidx.leanback.util.StateMachine$Transition r6 = (androidx.leanback.util.StateMachine.Transition) r6
            int r6 = r6.mState
            if (r6 != r1) goto L3a
        L4a:
            r5 = 1
            goto L4d
        L4c:
            r5 = 0
        L4d:
            if (r5 == 0) goto L83
            r4.mStatus = r1
            r4.run()
            java.util.ArrayList<androidx.leanback.util.StateMachine$Transition> r5 = r4.mOutgoings
            if (r5 == 0) goto L81
            java.util.Iterator r5 = r5.iterator()
        L5c:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L81
            java.lang.Object r6 = r5.next()
            androidx.leanback.util.StateMachine$Transition r6 = (androidx.leanback.util.StateMachine.Transition) r6
            androidx.leanback.util.StateMachine$Event r7 = r6.mEvent
            if (r7 != 0) goto L5c
            androidx.leanback.util.StateMachine$Condition r7 = r6.mCondition
            if (r7 == 0) goto L76
            boolean r7 = r7.canProceed()
            if (r7 == 0) goto L5c
        L76:
            int r7 = r4.mInvokedOutTransitions
            int r7 = r7 + r1
            r4.mInvokedOutTransitions = r7
            r6.mState = r1
            boolean r6 = r4.mBranchStart
            if (r6 != 0) goto L5c
        L81:
            r5 = 1
            goto L84
        L83:
            r5 = 0
        L84:
            if (r5 == 0) goto L91
            java.util.ArrayList<androidx.leanback.util.StateMachine$State> r3 = r8.mUnfinishedStates
            r3.remove(r0)
            java.util.ArrayList<androidx.leanback.util.StateMachine$State> r3 = r8.mFinishedStates
            r3.add(r4)
            r3 = 1
        L91:
            int r0 = r0 + (-1)
            goto La
        L95:
            if (r3 != 0) goto L0
            return
    }

    public void start() {
            r2 = this;
            java.util.ArrayList<androidx.leanback.util.StateMachine$State> r0 = r2.mUnfinishedStates
            java.util.ArrayList<androidx.leanback.util.StateMachine$State> r1 = r2.mStates
            r0.addAll(r1)
            r2.runUnfinishedStates()
            return
    }
}
