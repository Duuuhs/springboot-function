package com.duuuhs.sendmail.service;

import com.duuuhs.sendmail.vo.MailVo;

/**
 * @author Duuuhs
 * @description 邮件服务层
 * @create 2020/6/15 11:10
 */
public interface MailService {

    /**
     * 发送邮件
     * @param mailVo
     * @return
     */
    MailVo sendMail(MailVo mailVo);

    /**
     * 检测邮件信息
     * @param mailVo
     */
    void checkMail(MailVo mailVo);

    /**
     * 构建复杂邮件信息类
     * @param mailVo
     */
    void sendMimeMail(MailVo mailVo);

    /**
     * 保存邮件
     * @param mailVo
     * @return
     */
    MailVo saveMail(MailVo mailVo);

    /**
     * 获取邮件发信人
     * @return
     */
    String getMailSendFrom();
}
