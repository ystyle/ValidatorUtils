package net.lxy520.validate.test;

import net.lxy520.validate.entity.Tag;
import net.lxy520.validate.entity.User;
import net.lxy520.validator.utils.ValidationResult;
import net.lxy520.validator.utils.ValidationUtils;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by YSTYLE on 2015-03-10 0010.
 */
public class Test {
    public static void main(String[] args) throws IOException {
        User user = new User();
        Set<Tag> tags = new HashSet<Tag>();
        Tag tag = new Tag();
        tags.add(tag);
        user.setTags(tags);
        long start = System.currentTimeMillis();
        ValidationResult result = ValidationUtils.validateEntity(user);
        result.isHasErrors();
        result.getErrorMessage();
        System.out.println((System.currentTimeMillis() - start));
        System.out.println(result.getErrorMessage());
    }
}
