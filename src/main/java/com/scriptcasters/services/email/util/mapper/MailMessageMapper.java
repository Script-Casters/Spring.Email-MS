package com.scriptcasters.services.email.util.mapper;

import com.scriptcasters.services.email.model.GeneralMail;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
import org.springframework.mail.SimpleMailMessage;

@Mapper
public interface MailMessageMapper {

    MailMessageMapper INSTANCE = Mappers.getMapper(MailMessageMapper.class);

    @Mappings({
            @Mapping(source = "toEmails", target = "to"),
            @Mapping(source = "ccEmails", target = "cc"),
            @Mapping(source = "bccEmails", target = "bcc"),
            @Mapping(source = "subject", target = "subject"),
            @Mapping(source = "text", target = "contentPlainText")})
    SimpleMailMessage fromGeneralMail(GeneralMail generalMail);
}
