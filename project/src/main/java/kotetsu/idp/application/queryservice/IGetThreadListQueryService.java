/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package kotetsu.idp.application.queryservice;

import java.util.List;

import kotetsu.idp.application.dto.ThreadItem;

public interface IGetThreadListQueryService {
    List<ThreadItem> getThreadListOrderByCreatedAtDescLimit100();
}
