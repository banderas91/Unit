"""
Этот модуль содержит класс ListComparator, который сравнивает средние значения двух списков.
"""

class ListComparator:
    """
    Класс для сравнения средних значений двух списков.
    """
    def __init__(self, list1, list2):
        self.list1 = list1
        self.list2 = list2

    def calculate_average(self, lst):
        """
        Рассчитывает среднее значение списка.
        """
        if len(lst) == 0:
            return 0
        return sum(lst) / len(lst)

    def compare_averages(self):
        """
        Сравнивает средние значения двух списков и возвращает соответствующее сообщение.
        """
        avg1 = self.calculate_average(self.list1)
        avg2 = self.calculate_average(self.list2)

        if avg1 > avg2:
            return "Первый список имеет большее среднее значение"
        if avg2 > avg1:
            return "Второй список имеет большее среднее значение"
        return "Средние значения равны"
