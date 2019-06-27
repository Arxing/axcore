package org.arxing.apiconnector.interceptor;


import org.arxing.apiconnector.RequestChain;
import org.arxing.apiconnector.RequestInfo;
import org.arxing.apiconnector.ResponseBodyInfo;
import org.arxing.apiconnector.ResponseMap;

public abstract class ContentChainInterceptor implements ChainInterceptor {

    @Override public void beforeChain(RequestChain chain) {

    }

    @Override public void afterChain(RequestChain chain, boolean success, long costTimeMills) {

    }

    @Override public void beforeRequest(RequestChain chain, RequestInfo requestInfo, ResponseMap responseMap) {

    }

    @Override public void afterRequest(RequestChain chain,
                                       RequestInfo requestInfo,
                                       ResponseMap responseMap,
                                       boolean success,
                                       long costTimeMills, byte[] content) {

    }

    @Override public ResponseBodyInfo overrideResponseBodyInfo(RequestChain chain,
                                                               RequestInfo requestInfo,
                                                               ResponseBodyInfo response,
                                                               boolean isParseSuccess, byte[] content) {
        return response;
    }
}
