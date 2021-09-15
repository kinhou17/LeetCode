package Easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Every valid email consists of a local name and a domain name, separated by the '@' sign. Besides lowercase letters, the email may contain one or more '.' or '+'.
 *
 * For example, in "alice@leetcode.com", "alice" is the local name, and "leetcode.com" is the domain name.
 * If you add periods '.' between some characters in the local name part of an email address, mail sent there will be forwarded to the same address without dots in the local name. Note that this rule does not apply to domain names.
 *
 * For example, "alice.z@leetcode.com" and "alicez@leetcode.com" forward to the same email address.
 * If you add a plus '+' in the local name, everything after the first plus sign will be ignored. This allows certain emails to be filtered. Note that this rule does not apply to domain names.
 *
 * For example, "m.y+name@email.com" will be forwarded to "my@email.com".
 * It is possible to use both of these rules at the same time.
 *
 * Given an array of strings emails where we send one email to each email[i], return the number of different addresses that actually receive mails.
 */
public class UniqueEmailAddress {
  public int numUniqueEmails(String[] emails) {
    // hash set to store all the unique emails
    Set<String> uniqueEmails = new HashSet<>();

    for (String email : emails) {
      StringBuilder cleanMail = new StringBuilder();

      // iterate over each character in email
      for (int i = 0; i < email.length(); ++i) {
        char currChar = email.charAt(i);

        // stop adding characters to localName
        if (currChar == '+' || currChar == '@') break;

        // add this character if not '.'
        if (currChar != '.') cleanMail.append(currChar);
      }

      // compute domain name (substring from end to '@')
      StringBuilder domainName = new StringBuilder();

      for (int i = email.length() - 1; i >= 0; --i) {
        char currChar = email.charAt(i);
        domainName.append(currChar);
        if (currChar == '@') break;
      }

      domainName = domainName.reverse();
      cleanMail.append(domainName);
      uniqueEmails.add(cleanMail.toString());
    }

    return uniqueEmails.size();
  }
}
