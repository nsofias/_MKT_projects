/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ccm;

/**
 *
 * @author nsofias
 */
public interface CallInfo_factory {
    public CallInfo createCallInfo(String startTime, String lineId, String lineIdInFault, String reason);
}
