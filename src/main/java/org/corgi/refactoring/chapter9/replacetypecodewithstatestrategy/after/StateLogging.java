package org.corgi.refactoring.chapter9.replacetypecodewithstatestrategy.after;

// 분류 코드에 대응하는 상태 객체
public class StateLogging extends State {

    @Override
    public int getTypeCode() {
        return Logger.STATE_LOGGING;
    }
}
