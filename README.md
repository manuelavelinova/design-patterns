# design-patterns

Агенция за новини - шаблон Observer
Агенцията за новини уведомява телевизионните канали, когато има нова новина. 
Като в случая : 
observers са - телевизионните канали.(NewsSubscriber)
observable е -  новина/и (News).
subject е - самата агенция за новини. 

В observable.java имаме метод за добравяне и премахване на тв-канали чрез subscribe и unsubscribe.
Уведомяването за промяната стaва с notifyTVchannels().
Новата новина я взимам е от getUpdate().

В observer.java имаме метод за  обновяване на състоянието на оobserver и метод за друпосочната връзка.

В News.java създаваме лист за от Observer-и(тв канал) и реализираме subscribe() и unsubscribe().
В notifyTVchannels за всеки един тв канал извикваме неговият Update.
 
В NewsSubscriber.java  имаме update на новина(когато има нова),ако не - съобщаваме, че няма .

В NewsAgencyMain.java създавам новини и тв канали,които са subscribe-нати към агенцията.

